package com.produce.controller;

import com.produce.entity.TJournalProcess;

import com.produce.service.TJournalProcessService;
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
* @Description: TJournalProcessController类
* @author 李书瀚
* @date 2020/03/30 11:37
*/
@RestController
@RequestMapping("/tJournalProcess")
public class TJournalProcessController {

    private  static final Logger logger= LoggerFactory.getLogger(TJournalProcessController.class);
    @Autowired
    private TJournalProcessService tJournalProcessService;
    /**
    * 查询信息
    * @paramtJournalProcess
    * @return
    */
    @PostMapping(value = "/getTJournalProcess")
    @HttpLog(operationType = "0",modularTypeName = "查询TJournalProcess")
    public ActionRsp getTJournalProcess(TJournalProcess tJournalProcess,HttpServletRequest request){
    return ActionRspUtil.Success(tJournalProcessService.getTJournalProcess(tJournalProcess));
    }
    /**
    * 查询信息(分页)
    * @paramtJournalProcess
    * @return
    */
    @PostMapping(value = "/getTJournalProcessbyPage")
    @HttpLog(operationType = "0",modularTypeName = "查询TJournalProcess(分页)")
    public ControllerRsp getTJournalProcessbyPage(TJournalProcess tJournalProcess,HttpServletRequest request,Integer page, Integer limit){
    return ControllerRspUtil.Success(tJournalProcessService.getTJournalProcessbyPage(tJournalProcess,page,limit));
    }
    /**
    * 更新信息
    * @paramtJournalProcess
    * @return
    */
    @PostMapping(value = "/updateTJournalProcess")
    @HttpLog(operationType = "1",modularTypeName = "更新TJournalProcess信息")
    public ActionRsp UpdateTJournalProcess(TJournalProcess tJournalProcess,HttpServletRequest request)
    {
        return ActionRspUtil.Success(tJournalProcessService. UpdateTJournalProcess(tJournalProcess));
    }

    /**
    * 删除信息
    * @param id
    * @return
    */
    @PostMapping(value = "/deleteTJournalProcess")
    @HttpLog(operationType = "1",modularTypeName = "删除TJournalProcess信息")
    public ActionRsp DeleteTJournalProcess(Integer id){
    return ActionRspUtil.Success(tJournalProcessService.DeleteTJournalProcess(id));
    }
}