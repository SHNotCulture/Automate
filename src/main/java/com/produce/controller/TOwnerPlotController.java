package com.produce.controller;

import com.produce.entity.TOwnerPlot;

import com.produce.service.TOwnerPlotService;
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
* @Description: TOwnerPlotController类
* @author 李书瀚
* @date 2020/03/30 11:37
*/
@RestController
@RequestMapping("/tOwnerPlot")
public class TOwnerPlotController {

    private  static final Logger logger= LoggerFactory.getLogger(TOwnerPlotController.class);
    @Autowired
    private TOwnerPlotService tOwnerPlotService;
    /**
    * 查询信息
    * @paramtOwnerPlot
    * @return
    */
    @PostMapping(value = "/getTOwnerPlot")
    @HttpLog(operationType = "0",modularTypeName = "查询TOwnerPlot")
    public ActionRsp getTOwnerPlot(TOwnerPlot tOwnerPlot,HttpServletRequest request){
    return ActionRspUtil.Success(tOwnerPlotService.getTOwnerPlot(tOwnerPlot));
    }
    /**
    * 查询信息(分页)
    * @paramtOwnerPlot
    * @return
    */
    @PostMapping(value = "/getTOwnerPlotbyPage")
    @HttpLog(operationType = "0",modularTypeName = "查询TOwnerPlot(分页)")
    public ControllerRsp getTOwnerPlotbyPage(TOwnerPlot tOwnerPlot,HttpServletRequest request,Integer page, Integer limit){
    return ControllerRspUtil.Success(tOwnerPlotService.getTOwnerPlotbyPage(tOwnerPlot,page,limit));
    }
    /**
    * 更新信息
    * @paramtOwnerPlot
    * @return
    */
    @PostMapping(value = "/updateTOwnerPlot")
    @HttpLog(operationType = "1",modularTypeName = "更新TOwnerPlot信息")
    public ActionRsp UpdateTOwnerPlot(TOwnerPlot tOwnerPlot,HttpServletRequest request)
    {
        return ActionRspUtil.Success(tOwnerPlotService. UpdateTOwnerPlot(tOwnerPlot));
    }

    /**
    * 删除信息
    * @param id
    * @return
    */
    @PostMapping(value = "/deleteTOwnerPlot")
    @HttpLog(operationType = "1",modularTypeName = "删除TOwnerPlot信息")
    public ActionRsp DeleteTOwnerPlot(Integer id){
    return ActionRspUtil.Success(tOwnerPlotService.DeleteTOwnerPlot(id));
    }
}