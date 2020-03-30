package com.produce.controller;

import com.produce.entity.TPaySequence;

import com.produce.service.TPaySequenceService;
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
* @Description: TPaySequenceController类
* @author 李书瀚
* @date 2020/03/30 11:37
*/
@RestController
@RequestMapping("/tPaySequence")
public class TPaySequenceController {

    private  static final Logger logger= LoggerFactory.getLogger(TPaySequenceController.class);
    @Autowired
    private TPaySequenceService tPaySequenceService;
    /**
    * 查询信息
    * @paramtPaySequence
    * @return
    */
    @PostMapping(value = "/getTPaySequence")
    @HttpLog(operationType = "0",modularTypeName = "查询TPaySequence")
    public ActionRsp getTPaySequence(TPaySequence tPaySequence,HttpServletRequest request){
    return ActionRspUtil.Success(tPaySequenceService.getTPaySequence(tPaySequence));
    }
    /**
    * 查询信息(分页)
    * @paramtPaySequence
    * @return
    */
    @PostMapping(value = "/getTPaySequencebyPage")
    @HttpLog(operationType = "0",modularTypeName = "查询TPaySequence(分页)")
    public ControllerRsp getTPaySequencebyPage(TPaySequence tPaySequence,HttpServletRequest request,Integer page, Integer limit){
    return ControllerRspUtil.Success(tPaySequenceService.getTPaySequencebyPage(tPaySequence,page,limit));
    }
    /**
    * 更新信息
    * @paramtPaySequence
    * @return
    */
    @PostMapping(value = "/updateTPaySequence")
    @HttpLog(operationType = "1",modularTypeName = "更新TPaySequence信息")
    public ActionRsp UpdateTPaySequence(TPaySequence tPaySequence,HttpServletRequest request)
    {
        return ActionRspUtil.Success(tPaySequenceService. UpdateTPaySequence(tPaySequence));
    }

    /**
    * 删除信息
    * @param id
    * @return
    */
    @PostMapping(value = "/deleteTPaySequence")
    @HttpLog(operationType = "1",modularTypeName = "删除TPaySequence信息")
    public ActionRsp DeleteTPaySequence(Integer id){
    return ActionRspUtil.Success(tPaySequenceService.DeleteTPaySequence(id));
    }
}