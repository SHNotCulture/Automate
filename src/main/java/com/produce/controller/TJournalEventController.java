package com.produce.controller;

import com.produce.entity.TJournalEvent;

import com.produce.service.TJournalEventService;
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
* @Description: TJournalEventController类
* @author 李书瀚
* @date 2020/03/30 11:37
*/
@RestController
@RequestMapping("/tJournalEvent")
public class TJournalEventController {

    private  static final Logger logger= LoggerFactory.getLogger(TJournalEventController.class);
    @Autowired
    private TJournalEventService tJournalEventService;
    /**
    * 查询信息
    * @paramtJournalEvent
    * @return
    */
    @PostMapping(value = "/getTJournalEvent")
    @HttpLog(operationType = "0",modularTypeName = "查询TJournalEvent")
    public ActionRsp getTJournalEvent(TJournalEvent tJournalEvent,HttpServletRequest request){
    return ActionRspUtil.Success(tJournalEventService.getTJournalEvent(tJournalEvent));
    }
    /**
    * 查询信息(分页)
    * @paramtJournalEvent
    * @return
    */
    @PostMapping(value = "/getTJournalEventbyPage")
    @HttpLog(operationType = "0",modularTypeName = "查询TJournalEvent(分页)")
    public ControllerRsp getTJournalEventbyPage(TJournalEvent tJournalEvent,HttpServletRequest request,Integer page, Integer limit){
    return ControllerRspUtil.Success(tJournalEventService.getTJournalEventbyPage(tJournalEvent,page,limit));
    }
    /**
    * 更新信息
    * @paramtJournalEvent
    * @return
    */
    @PostMapping(value = "/updateTJournalEvent")
    @HttpLog(operationType = "1",modularTypeName = "更新TJournalEvent信息")
    public ActionRsp UpdateTJournalEvent(TJournalEvent tJournalEvent,HttpServletRequest request)
    {
        return ActionRspUtil.Success(tJournalEventService. UpdateTJournalEvent(tJournalEvent));
    }

    /**
    * 删除信息
    * @param id
    * @return
    */
    @PostMapping(value = "/deleteTJournalEvent")
    @HttpLog(operationType = "1",modularTypeName = "删除TJournalEvent信息")
    public ActionRsp DeleteTJournalEvent(Integer id){
    return ActionRspUtil.Success(tJournalEventService.DeleteTJournalEvent(id));
    }
}