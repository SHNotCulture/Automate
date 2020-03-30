package com.produce.controller;

import com.produce.entity.TCardCoupon;

import com.produce.service.TCardCouponService;
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
* @Description: TCardCouponController类
* @author 李书瀚
* @date 2020/03/30 11:37
*/
@RestController
@RequestMapping("/tCardCoupon")
public class TCardCouponController {

    private  static final Logger logger= LoggerFactory.getLogger(TCardCouponController.class);
    @Autowired
    private TCardCouponService tCardCouponService;
    /**
    * 查询信息
    * @paramtCardCoupon
    * @return
    */
    @PostMapping(value = "/getTCardCoupon")
    @HttpLog(operationType = "0",modularTypeName = "查询TCardCoupon")
    public ActionRsp getTCardCoupon(TCardCoupon tCardCoupon,HttpServletRequest request){
    return ActionRspUtil.Success(tCardCouponService.getTCardCoupon(tCardCoupon));
    }
    /**
    * 查询信息(分页)
    * @paramtCardCoupon
    * @return
    */
    @PostMapping(value = "/getTCardCouponbyPage")
    @HttpLog(operationType = "0",modularTypeName = "查询TCardCoupon(分页)")
    public ControllerRsp getTCardCouponbyPage(TCardCoupon tCardCoupon,HttpServletRequest request,Integer page, Integer limit){
    return ControllerRspUtil.Success(tCardCouponService.getTCardCouponbyPage(tCardCoupon,page,limit));
    }
    /**
    * 更新信息
    * @paramtCardCoupon
    * @return
    */
    @PostMapping(value = "/updateTCardCoupon")
    @HttpLog(operationType = "1",modularTypeName = "更新TCardCoupon信息")
    public ActionRsp UpdateTCardCoupon(TCardCoupon tCardCoupon,HttpServletRequest request)
    {
        return ActionRspUtil.Success(tCardCouponService. UpdateTCardCoupon(tCardCoupon));
    }

    /**
    * 删除信息
    * @param id
    * @return
    */
    @PostMapping(value = "/deleteTCardCoupon")
    @HttpLog(operationType = "1",modularTypeName = "删除TCardCoupon信息")
    public ActionRsp DeleteTCardCoupon(Integer id){
    return ActionRspUtil.Success(tCardCouponService.DeleteTCardCoupon(id));
    }
}