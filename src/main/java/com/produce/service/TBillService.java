package com.produce.service;

import com.produce.entity.TBill;
import com.produce.util.PageBean;

import java.util.List;

/**
* @Description: TBillService接口
* @author 李书瀚
* @date 2020/03/30 11:37
*/
public interface TBillService {
    PageBean<TBill> getTBillbyPage(TBill tBill, Integer page, Integer limit);
    List<TBill> getTBill(TBill tBill);
    String UpdateTBill(TBill tBill);
    String DeleteTBill(Integer id);
    TBill getTBillByID(Integer id);

}