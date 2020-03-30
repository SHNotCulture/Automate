package com.produce.service.impl;

import com.produce.dao.TBillMapper;
import com.produce.entity.TBill;
import com.produce.service.TBillService;
import com.produce.entity.TBillCriteria;
import com.produce.util.PageBean;
import org.springframework.stereotype.Service;
import com.github.pagehelper.PageHelper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

/**
* @Description: TBillService接口实现类
* @author 李书瀚
* @date 2020/03/30 11:37
*/
@Service
public class TBillServiceImpl  implements TBillService {

    private  static final Logger logger= LoggerFactory.getLogger( TBillServiceImpl.class);
    @Autowired
    private TBillMapper tBillMapper;

    /**
    * 设置查询条件
    * @param tBill
    * @return
    */
    private  TBillCriteria setCriteria(TBill tBill){
        TBillCriteria tBillCriteria= new TBillCriteria();
        if(tBill!=null){
        TBillCriteria.Criteria criteria=tBillCriteria.createCriteria();
        if(tBill.getId()!=null){
        criteria.andIdEqualTo(tBill.getId());
        }

        }
        return  tBillCriteria;
    }
    /**
    * 获取数据总量
    * @param tBill
    * @return
    */
    private Integer getCount(TBill tBill){
    Integer total =(int)tBillMapper.countByExample(setCriteria(tBill));
    return total;
    }
    /**
    *查询(分页)
    * @param tBill
    * @param page
    * @param limit
    * @return
    */
    public PageBean<TBill> getTBillbyPage(TBill tBill, Integer page, Integer limit){
        PageHelper.startPage(page, limit,"id desc");
        List<TBill> TBills=getTBill(tBill);
            Integer countNums =getCount(tBill);
            PageBean<TBill> pageData = new PageBean<>(page, limit, countNums);
            pageData.setItems(TBills);
            return pageData;
        }
    /**
    * 查询
    * @param tBill
    * @return
    */
    public List<TBill> getTBill(TBill tBill){
    List<TBill>  TBills=tBillMapper.selectByExample(setCriteria(tBill));
    return TBills;
    }
    /**
    * 更新
    * @param tBill
    * @return
    */
    public String UpdateTBill(TBill tBill)
    {
            String result="";
            try{
            if(tBill.getId()!=null){
            tBillMapper.updateByPrimaryKeySelective(tBill);
            }
            else
            {
            tBillMapper.insertSelective(tBill);
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
    public String DeleteTBill(Integer id){
    tBillMapper.deleteByPrimaryKey(id);
    return "删除成功";
    }

    /**
    * 根据ID查询
    * @param id
    * @return
    */
    public TBill getTBillByID(Integer id) {
    return  tBillMapper.selectByPrimaryKey(id);
    }
}
