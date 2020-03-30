package com.produce.controller;

import com.produce.entity.TNotice;

import com.produce.service.TNoticeService;
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
* @Description: TNoticeController类
* @author 李书瀚
* @date 2020/03/30 11:37
*/
@RestController
@RequestMapping("/tNotice")
public class TNoticeController {

    private  static final Logger logger= LoggerFactory.getLogger(TNoticeController.class);
    @Autowired
    private TNoticeService tNoticeService;
    /**
    * 查询信息
    * @paramtNotice
    * @return
    */
    @PostMapping(value = "/getTNotice")
    @HttpLog(operationType = "0",modularTypeName = "查询TNotice")
    public ActionRsp getTNotice(TNotice tNotice,HttpServletRequest request){
    return ActionRspUtil.Success(tNoticeService.getTNotice(tNotice));
    }
    /**
    * 查询信息(分页)
    * @paramtNotice
    * @return
    */
    @PostMapping(value = "/getTNoticebyPage")
    @HttpLog(operationType = "0",modularTypeName = "查询TNotice(分页)")
    public ControllerRsp getTNoticebyPage(TNotice tNotice,HttpServletRequest request,Integer page, Integer limit){
    return ControllerRspUtil.Success(tNoticeService.getTNoticebyPage(tNotice,page,limit));
    }
    /**
    * 更新信息
    * @paramtNotice
    * @return
    */
    @PostMapping(value = "/updateTNotice")
    @HttpLog(operationType = "1",modularTypeName = "更新TNotice信息")
    public ActionRsp UpdateTNotice(TNotice tNotice,HttpServletRequest request)
    {
        return ActionRspUtil.Success(tNoticeService. UpdateTNotice(tNotice));
    }

    /**
    * 删除信息
    * @param id
    * @return
    */
    @PostMapping(value = "/deleteTNotice")
    @HttpLog(operationType = "1",modularTypeName = "删除TNotice信息")
    public ActionRsp DeleteTNotice(Integer id){
    return ActionRspUtil.Success(tNoticeService.DeleteTNotice(id));
    }
}