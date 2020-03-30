package com.produce.service.impl;

import com.produce.dao.TCardCouponMapper;
import com.produce.entity.TCardCoupon;
import com.produce.service.TCardCouponService;
import com.produce.entity.TCardCouponCriteria;
import com.produce.util.PageBean;
import org.springframework.stereotype.Service;
import com.github.pagehelper.PageHelper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

/**
* @Description: TCardCouponService接口实现类
* @author 李书瀚
* @date 2020/03/30 11:37
*/
@Service
public class TCardCouponServiceImpl  implements TCardCouponService {

    private  static final Logger logger= LoggerFactory.getLogger( TCardCouponServiceImpl.class);
    @Autowired
    private TCardCouponMapper tCardCouponMapper;

    /**
    * 设置查询条件
    * @param tCardCoupon
    * @return
    */
    private  TCardCouponCriteria setCriteria(TCardCoupon tCardCoupon){
        TCardCouponCriteria tCardCouponCriteria= new TCardCouponCriteria();
        if(tCardCoupon!=null){
        TCardCouponCriteria.Criteria criteria=tCardCouponCriteria.createCriteria();
        if(tCardCoupon.getId()!=null){
        criteria.andIdEqualTo(tCardCoupon.getId());
        }

        }
        return  tCardCouponCriteria;
    }
    /**
    * 获取数据总量
    * @param tCardCoupon
    * @return
    */
    private Integer getCount(TCardCoupon tCardCoupon){
    Integer total =(int)tCardCouponMapper.countByExample(setCriteria(tCardCoupon));
    return total;
    }
    /**
    *查询(分页)
    * @param tCardCoupon
    * @param page
    * @param limit
    * @return
    */
    public PageBean<TCardCoupon> getTCardCouponbyPage(TCardCoupon tCardCoupon, Integer page, Integer limit){
        PageHelper.startPage(page, limit,"id desc");
        List<TCardCoupon> TCardCoupons=getTCardCoupon(tCardCoupon);
            Integer countNums =getCount(tCardCoupon);
            PageBean<TCardCoupon> pageData = new PageBean<>(page, limit, countNums);
            pageData.setItems(TCardCoupons);
            return pageData;
        }
    /**
    * 查询
    * @param tCardCoupon
    * @return
    */
    public List<TCardCoupon> getTCardCoupon(TCardCoupon tCardCoupon){
    List<TCardCoupon>  TCardCoupons=tCardCouponMapper.selectByExample(setCriteria(tCardCoupon));
    return TCardCoupons;
    }
    /**
    * 更新
    * @param tCardCoupon
    * @return
    */
    public String UpdateTCardCoupon(TCardCoupon tCardCoupon)
    {
            String result="";
            try{
            if(tCardCoupon.getId()!=null){
            tCardCouponMapper.updateByPrimaryKeySelective(tCardCoupon);
            }
            else
            {
            tCardCouponMapper.insertSelective(tCardCoupon);
            }
            }
            catch (Exception e)
            {

            }
            result="更新成功";
            return result;
    }
    /**
    * 删除
    * @param id
    * @return
    */
    public String DeleteTCardCoupon(Integer id){
    tCardCouponMapper.deleteByPrimaryKey(id);
    return "删除成功";
    }

    /**
    * 根据ID查询
    * @param id
    * @return
    */
    public TCardCoupon getTCardCouponByID(Integer id) {
    return  tCardCouponMapper.selectByPrimaryKey(id);
    }
}
