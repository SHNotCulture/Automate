package com.produce.controller;

import com.produce.entity.TCarStatus;

import com.produce.service.TCarStatusService;
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
* @Description: TCarStatusController类
* @author 李书瀚
* @date 2020/03/30 11:37
*/
@RestController
@RequestMapping("/tCarStatus")
public class TCarStatusController {

    private  static final Logger logger= LoggerFactory.getLogger(TCarStatusController.class);
    @Autowired
    private TCarStatusService tCarStatusService;
    /**
    * 查询信息
    * @paramtCarStatus
    * @return
    */
    @PostMapping(value = "/getTCarStatus")
    @HttpLog(operationType = "0",modularTypeName = "查询TCarStatus")
    public ActionRsp getTCarStatus(TCarStatus tCarStatus,HttpServletRequest request){
    return ActionRspUtil.Success(tCarStatusService.getTCarStatus(tCarStatus));
    }
    /**
    * 查询信息(分页)
    * @paramtCarStatus
    * @return
    */
    @PostMapping(value = "/getTCarStatusbyPage")
    @HttpLog(operationType = "0",modularTypeName = "查询TCarStatus(分页)")
    public ControllerRsp getTCarStatusbyPage(TCarStatus tCarStatus,HttpServletRequest request,Integer page, Integer limit){
    return ControllerRspUtil.Success(tCarStatusService.getTCarStatusbyPage(tCarStatus,page,limit));
    }
    /**
    * 更新信息
    * @paramtCarStatus
    * @return
    */
    @PostMapping(value = "/updateTCarStatus")
    @HttpLog(operationType = "1",modularTypeName = "更新TCarStatus信息")
    public ActionRsp UpdateTCarStatus(TCarStatus tCarStatus,HttpServletRequest request)
    {
        return ActionRspUtil.Success(tCarStatusService. UpdateTCarStatus(tCarStatus));
    }

    /**
    * 删除信息
    * @param id
    * @return
    */
    @PostMapping(value = "/deleteTCarStatus")
    @HttpLog(operationType = "1",modularTypeName = "删除TCarStatus信息")
    public ActionRsp DeleteTCarStatus(Integer id){
    return ActionRspUtil.Success(tCarStatusService.DeleteTCarStatus(id));
    }
}