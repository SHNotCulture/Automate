package com.produce.controller;

import com.produce.entity.TCarRecord;

import com.produce.service.TCarRecordService;
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
* @Description: TCarRecordController类
* @author 李书瀚
* @date 2020/03/30 11:37
*/
@RestController
@RequestMapping("/tCarRecord")
public class TCarRecordController {

    private  static final Logger logger= LoggerFactory.getLogger(TCarRecordController.class);
    @Autowired
    private TCarRecordService tCarRecordService;
    /**
    * 查询信息
    * @paramtCarRecord
    * @return
    */
    @PostMapping(value = "/getTCarRecord")
    @HttpLog(operationType = "0",modularTypeName = "查询TCarRecord")
    public ActionRsp getTCarRecord(TCarRecord tCarRecord,HttpServletRequest request){
    return ActionRspUtil.Success(tCarRecordService.getTCarRecord(tCarRecord));
    }
    /**
    * 查询信息(分页)
    * @paramtCarRecord
    * @return
    */
    @PostMapping(value = "/getTCarRecordbyPage")
    @HttpLog(operationType = "0",modularTypeName = "查询TCarRecord(分页)")
    public ControllerRsp getTCarRecordbyPage(TCarRecord tCarRecord,HttpServletRequest request,Integer page, Integer limit){
    return ControllerRspUtil.Success(tCarRecordService.getTCarRecordbyPage(tCarRecord,page,limit));
    }
    /**
    * 更新信息
    * @paramtCarRecord
    * @return
    */
    @PostMapping(value = "/updateTCarRecord")
    @HttpLog(operationType = "1",modularTypeName = "更新TCarRecord信息")
    public ActionRsp UpdateTCarRecord(TCarRecord tCarRecord,HttpServletRequest request)
    {
        return ActionRspUtil.Success(tCarRecordService. UpdateTCarRecord(tCarRecord));
    }

    /**
    * 删除信息
    * @param id
    * @return
    */
    @PostMapping(value = "/deleteTCarRecord")
    @HttpLog(operationType = "1",modularTypeName = "删除TCarRecord信息")
    public ActionRsp DeleteTCarRecord(Integer id){
    return ActionRspUtil.Success(tCarRecordService.DeleteTCarRecord(id));
    }
}