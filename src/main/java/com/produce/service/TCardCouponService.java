package com.produce.service;

import com.produce.entity.TCardCoupon;
import com.produce.util.PageBean;

import java.util.List;

/**
* @Description: TCardCouponService接口
* @author 李书瀚
* @date 2020/03/30 11:37
*/
public interface TCardCouponService {
    PageBean<TCardCoupon> getTCardCouponbyPage(TCardCoupon tCardCoupon, Integer page, Integer limit);
    List<TCardCoupon> getTCardCoupon(TCardCoupon tCardCoupon);
    String UpdateTCardCoupon(TCardCoupon tCardCoupon);
    String DeleteTCardCoupon(Integer id);
    TCardCoupon getTCardCouponByID(Integer id);

}