package com.produce.controller;

import com.produce.entity.TBill;

import com.produce.service.TBillService;
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
* @Description: TBillController类
* @author 李书瀚
* @date 2020/03/30 11:37
*/
@RestController
@RequestMapping("/tBill")
public class TBillController {

    private  static final Logger logger= LoggerFactory.getLogger(TBillController.class);
    @Autowired
    private TBillService tBillService;
    /**
    * 查询信息
    * @paramtBill
    * @return
    */
    @PostMapping(value = "/getTBill")
    @HttpLog(operationType = "0",modularTypeName = "查询TBill")
    public ActionRsp getTBill(TBill tBill,HttpServletRequest request){
    return ActionRspUtil.Success(tBillService.getTBill(tBill));
    }
    /**
    * 查询信息(分页)
    * @paramtBill
    * @return
    */
    @PostMapping(value = "/getTBillbyPage")
    @HttpLog(operationType = "0",modularTypeName = "查询TBill(分页)")
    public ControllerRsp getTBillbyPage(TBill tBill,HttpServletRequest request,Integer page, Integer limit){
    return ControllerRspUtil.Success(tBillService.getTBillbyPage(tBill,page,limit));
    }
    /**
    * 更新信息
    * @paramtBill
    * @return
    */
    @PostMapping(value = "/updateTBill")
    @HttpLog(operationType = "1",modularTypeName = "更新TBill信息")
    public ActionRsp UpdateTBill(TBill tBill,HttpServletRequest request)
    {
        return ActionRspUtil.Success(tBillService. UpdateTBill(tBill));
    }

    /**
    * 删除信息
    * @param id
    * @return
    */
    @PostMapping(value = "/deleteTBill")
    @HttpLog(operationType = "1",modularTypeName = "删除TBill信息")
    public ActionRsp DeleteTBill(Integer id){
    return ActionRspUtil.Success(tBillService.DeleteTBill(id));
    }
}