package com.produce.service.impl;

import com.produce.dao.TParkCarMapper;
import com.produce.entity.TParkCar;
import com.produce.service.TParkCarService;
import com.produce.entity.TParkCarCriteria;
import com.produce.util.PageBean;
import org.springframework.stereotype.Service;
import com.github.pagehelper.PageHelper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

/**
* @Description: TParkCarService接口实现类
* @author 李书瀚
* @date 2020/03/30 11:37
*/
@Service
public class TParkCarServiceImpl  implements TParkCarService {

    private  static final Logger logger= LoggerFactory.getLogger( TParkCarServiceImpl.class);
    @Autowired
    private TParkCarMapper tParkCarMapper;

    /**
    * 设置查询条件
    * @param tParkCar
    * @return
    */
    private  TParkCarCriteria setCriteria(TParkCar tParkCar){
        TParkCarCriteria tParkCarCriteria= new TParkCarCriteria();
        if(tParkCar!=null){
        TParkCarCriteria.Criteria criteria=tParkCarCriteria.createCriteria();
        if(tParkCar.getId()!=null){
        criteria.andIdEqualTo(tParkCar.getId());
        }

        }
        return  tParkCarCriteria;
    }
    /**
    * 获取数据总量
    * @param tParkCar
    * @return
    */
    private Integer getCount(TParkCar tParkCar){
    Integer total =(int)tParkCarMapper.countByExample(setCriteria(tParkCar));
    return total;
    }
    /**
    *查询(分页)
    * @param tParkCar
    * @param page
    * @param limit
    * @return
    */
    public PageBean<TParkCar> getTParkCarbyPage(TParkCar tParkCar, Integer page, Integer limit){
        PageHelper.startPage(page, limit,"id desc");
        List<TParkCar> TParkCars=getTParkCar(tParkCar);
            Integer countNums =getCount(tParkCar);
            PageBean<TParkCar> pageData = new PageBean<>(page, limit, countNums);
            pageData.setItems(TParkCars);
            return pageData;
        }
    /**
    * 查询
    * @param tParkCar
    * @return
    */
    public List<TParkCar> getTParkCar(TParkCar tParkCar){
    List<TParkCar>  TParkCars=tParkCarMapper.selectByExample(setCriteria(tParkCar));
    return TParkCars;
    }
    /**
    * 更新
    * @param tParkCar
    * @return
    */
    public String UpdateTParkCar(TParkCar tParkCar)
    {
            String result="";
            try{
            if(tParkCar.getId()!=null){
            tParkCarMapper.updateByPrimaryKeySelective(tParkCar);
            }
            else
            {
            tParkCarMapper.insertSelective(tParkCar);
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
    public String DeleteTParkCar(Integer id){
    tParkCarMapper.deleteByPrimaryKey(id);
    return "删除成功";
    }

    /**
    * 根据ID查询
    * @param id
    * @return
    */
    public TParkCar getTParkCarByID(Integer id) {
    return  tParkCarMapper.selectByPrimaryKey(id);
    }
}
