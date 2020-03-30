package com.produce.controller;

import com.produce.entity.TParkCar;

import com.produce.service.TParkCarService;
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
* @Description: TParkCarController类
* @author 李书瀚
* @date 2020/03/30 11:37
*/
@RestController
@RequestMapping("/tParkCar")
public class TParkCarController {

    private  static final Logger logger= LoggerFactory.getLogger(TParkCarController.class);
    @Autowired
    private TParkCarService tParkCarService;
    /**
    * 查询信息
    * @paramtParkCar
    * @return
    */
    @PostMapping(value = "/getTParkCar")
    @HttpLog(operationType = "0",modularTypeName = "查询TParkCar")
    public ActionRsp getTParkCar(TParkCar tParkCar,HttpServletRequest request){
    return ActionRspUtil.Success(tParkCarService.getTParkCar(tParkCar));
    }
    /**
    * 查询信息(分页)
    * @paramtParkCar
    * @return
    */
    @PostMapping(value = "/getTParkCarbyPage")
    @HttpLog(operationType = "0",modularTypeName = "查询TParkCar(分页)")
    public ControllerRsp getTParkCarbyPage(TParkCar tParkCar,HttpServletRequest request,Integer page, Integer limit){
    return ControllerRspUtil.Success(tParkCarService.getTParkCarbyPage(tParkCar,page,limit));
    }
    /**
    * 更新信息
    * @paramtParkCar
    * @return
    */
    @PostMapping(value = "/updateTParkCar")
    @HttpLog(operationType = "1",modularTypeName = "更新TParkCar信息")
    public ActionRsp UpdateTParkCar(TParkCar tParkCar,HttpServletRequest request)
    {
        return ActionRspUtil.Success(tParkCarService. UpdateTParkCar(tParkCar));
    }

    /**
    * 删除信息
    * @param id
    * @return
    */
    @PostMapping(value = "/deleteTParkCar")
    @HttpLog(operationType = "1",modularTypeName = "删除TParkCar信息")
    public ActionRsp DeleteTParkCar(Integer id){
    return ActionRspUtil.Success(tParkCarService.DeleteTParkCar(id));
    }
}