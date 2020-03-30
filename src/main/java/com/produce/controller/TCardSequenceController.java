package com.produce.controller;

import com.produce.entity.TCardSequence;

import com.produce.service.TCardSequenceService;
import com.produce.aspect.HttpLog;
import com.produce.util.ControllerRspUtil;
import com.produce.util.ActionRspUtil;
import com.produce.util.ControllerRsp;
import com.produce.util.ActionRsp;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
* @Description: TCardSequenceController类
* @author 李书瀚
* @date 2020/03/30 11:37
*/
@RestController
@RequestMapping("/tCardSequence")
public class TCardSequenceController {

    private  static final Logger logger= LoggerFactory.getLogger(TCardSequenceController.class);
    @Autowired
    private TCardSequenceService tCardSequenceService;
    /**
    * 查询信息
    * @paramtCardSequence
    * @return
    */
    @PostMapping(value = "/getTCardSequence")
    @HttpLog(operationType = "0",modularTypeName = "查询TCardSequence")
    public ActionRsp getTCardSequence(TCardSequence tCardSequence,HttpServletRequest request){
    return ActionRspUtil.Success(tCardSequenceService.getTCardSequence(tCardSequence));
    }
    /**
    * 查询信息(分页)
    * @paramtCardSequence
    * @return
    */
    @PostMapping(value = "/getTCardSequencebyPage")
    @HttpLog(operationType = "0",modularTypeName = "查询TCardSequence(分页)")
    public ControllerRsp getTCardSequencebyPage(TCardSequence tCardSequence,HttpServletRequest request,Integer page, Integer limit){
    return ControllerRspUtil.Success(tCardSequenceService.getTCardSequencebyPage(tCardSequence,page,limit));
    }
    /**
    * 更新信息
    * @paramtCardSequence
    * @return
    */
    @PostMapping(value = "/updateTCardSequence")
    @HttpLog(operationType = "1",modularTypeName = "更新TCardSequence信息")
    public ActionRsp UpdateTCardSequence(TCardSequence tCardSequence,HttpServletRequest request)
    {
        return ActionRspUtil.Success(tCardSequenceService. UpdateTCardSequence(tCardSequence));
    }

    /**
    * 删除信息
    * @param id
    * @return
    */
    @PostMapping(value = "/deleteTCardSequence")
    @HttpLog(operationType = "1",modularTypeName = "删除TCardSequence信息")
    public ActionRsp DeleteTCardSequence(Integer id){
    return ActionRspUtil.Success(tCardSequenceService.DeleteTCardSequence(id));
    }
}