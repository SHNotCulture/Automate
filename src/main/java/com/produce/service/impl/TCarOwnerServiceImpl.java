package com.produce.service.impl;

import com.produce.dao.TCarOwnerMapper;
import com.produce.entity.TCarOwner;
import com.produce.service.TCarOwnerService;
import com.produce.entity.TCarOwnerCriteria;
import com.produce.util.PageBean;
import org.springframework.stereotype.Service;
import com.github.pagehelper.PageHelper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

/**
* @Description: TCarOwnerService接口实现类
* @author 李书瀚
* @date 2020/03/30 11:37
*/
@Service
public class TCarOwnerServiceImpl  implements TCarOwnerService {

    private  static final Logger logger= LoggerFactory.getLogger( TCarOwnerServiceImpl.class);
    @Autowired
    private TCarOwnerMapper tCarOwnerMapper;

    /**
    * 设置查询条件
    * @param tCarOwner
    * @return
    */
    private  TCarOwnerCriteria setCriteria(TCarOwner tCarOwner){
        TCarOwnerCriteria tCarOwnerCriteria= new TCarOwnerCriteria();
        if(tCarOwner!=null){
        TCarOwnerCriteria.Criteria criteria=tCarOwnerCriteria.createCriteria();
        if(tCarOwner.getId()!=null){
        criteria.andIdEqualTo(tCarOwner.getId());
        }

        }
        return  tCarOwnerCriteria;
    }
    /**
    * 获取数据总量
    * @param tCarOwner
    * @return
    */
    private Integer getCount(TCarOwner tCarOwner){
    Integer total =(int)tCarOwnerMapper.countByExample(setCriteria(tCarOwner));
    return total;
    }
    /**
    *查询(分页)
    * @param tCarOwner
    * @param page
    * @param limit
    * @return
    */
    public PageBean<TCarOwner> getTCarOwnerbyPage(TCarOwner tCarOwner, Integer page, Integer limit){
        PageHelper.startPage(page, limit,"id desc");
        List<TCarOwner> TCarOwners=getTCarOwner(tCarOwner);
            Integer countNums =getCount(tCarOwner);
            PageBean<TCarOwner> pageData = new PageBean<>(page, limit, countNums);
            pageData.setItems(TCarOwners);
            return pageData;
        }
    /**
    * 查询
    * @param tCarOwner
    * @return
    */
    public List<TCarOwner> getTCarOwner(TCarOwner tCarOwner){
    List<TCarOwner>  TCarOwners=tCarOwnerMapper.selectByExample(setCriteria(tCarOwner));
    return TCarOwners;
    }
    /**
    * 更新
    * @param tCarOwner
    * @return
    */
    public String UpdateTCarOwner(TCarOwner tCarOwner)
    {
            String result="";
            try{
            if(tCarOwner.getId()!=null){
            tCarOwnerMapper.updateByPrimaryKeySelective(tCarOwner);
            }
            else
            {
            tCarOwnerMapper.insertSelective(tCarOwner);
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
    public String DeleteTCarOwner(Integer id){
    tCarOwnerMapper.deleteByPrimaryKey(id);
    return "删除成功";
    }

    /**
    * 根据ID查询
    * @param id
    * @return
    */
    public TCarOwner getTCarOwnerByID(Integer id) {
    return  tCarOwnerMapper.selectByPrimaryKey(id);
    }
}
