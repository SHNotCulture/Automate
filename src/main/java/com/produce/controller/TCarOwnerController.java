package com.produce.controller;

import com.produce.entity.TCarOwner;

import com.produce.service.TCarOwnerService;
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
* @Description: TCarOwnerController类
* @author 李书瀚
* @date 2020/03/30 11:37
*/
@RestController
@RequestMapping("/tCarOwner")
public class TCarOwnerController {

    private  static final Logger logger= LoggerFactory.getLogger(TCarOwnerController.class);
    @Autowired
    private TCarOwnerService tCarOwnerService;
    /**
    * 查询信息
    * @paramtCarOwner
    * @return
    */
    @PostMapping(value = "/getTCarOwner")
    @HttpLog(operationType = "0",modularTypeName = "查询TCarOwner")
    public ActionRsp getTCarOwner(TCarOwner tCarOwner,HttpServletRequest request){
    return ActionRspUtil.Success(tCarOwnerService.getTCarOwner(tCarOwner));
    }
    /**
    * 查询信息(分页)
    * @paramtCarOwner
    * @return
    */
    @PostMapping(value = "/getTCarOwnerbyPage")
    @HttpLog(operationType = "0",modularTypeName = "查询TCarOwner(分页)")
    public ControllerRsp getTCarOwnerbyPage(TCarOwner tCarOwner,HttpServletRequest request,Integer page, Integer limit){
    return ControllerRspUtil.Success(tCarOwnerService.getTCarOwnerbyPage(tCarOwner,page,limit));
    }
    /**
    * 更新信息
    * @paramtCarOwner
    * @return
    */
    @PostMapping(value = "/updateTCarOwner")
    @HttpLog(operationType = "1",modularTypeName = "更新TCarOwner信息")
    public ActionRsp UpdateTCarOwner(TCarOwner tCarOwner,HttpServletRequest request)
    {
        return ActionRspUtil.Success(tCarOwnerService. UpdateTCarOwner(tCarOwner));
    }

    /**
    * 删除信息
    * @param id
    * @return
    */
    @PostMapping(value = "/deleteTCarOwner")
    @HttpLog(operationType = "1",modularTypeName = "删除TCarOwner信息")
    public ActionRsp DeleteTCarOwner(Integer id){
    return ActionRspUtil.Success(tCarOwnerService.DeleteTCarOwner(id));
    }
}