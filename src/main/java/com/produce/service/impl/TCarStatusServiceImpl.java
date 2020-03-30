package com.produce.service.impl;

import com.produce.dao.TCarStatusMapper;
import com.produce.entity.TCarStatus;
import com.produce.service.TCarStatusService;
import com.produce.entity.TCarStatusCriteria;
import com.produce.util.PageBean;
import org.springframework.stereotype.Service;
import com.github.pagehelper.PageHelper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

/**
* @Description: TCarStatusService接口实现类
* @author 李书瀚
* @date 2020/03/30 11:37
*/
@Service
public class TCarStatusServiceImpl  implements TCarStatusService {

    private  static final Logger logger= LoggerFactory.getLogger( TCarStatusServiceImpl.class);
    @Autowired
    private TCarStatusMapper tCarStatusMapper;

    /**
    * 设置查询条件
    * @param tCarStatus
    * @return
    */
    private  TCarStatusCriteria setCriteria(TCarStatus tCarStatus){
        TCarStatusCriteria tCarStatusCriteria= new TCarStatusCriteria();
        if(tCarStatus!=null){
        TCarStatusCriteria.Criteria criteria=tCarStatusCriteria.createCriteria();
        if(tCarStatus.getId()!=null){
        criteria.andIdEqualTo(tCarStatus.getId());
        }

        }
        return  tCarStatusCriteria;
    }
    /**
    * 获取数据总量
    * @param tCarStatus
    * @return
    */
    private Integer getCount(TCarStatus tCarStatus){
    Integer total =(int)tCarStatusMapper.countByExample(setCriteria(tCarStatus));
    return total;
    }
    /**
    *查询(分页)
    * @param tCarStatus
    * @param page
    * @param limit
    * @return
    */
    public PageBean<TCarStatus> getTCarStatusbyPage(TCarStatus tCarStatus, Integer page, Integer limit){
        PageHelper.startPage(page, limit,"id desc");
        List<TCarStatus> TCarStatuss=getTCarStatus(tCarStatus);
            Integer countNums =getCount(tCarStatus);
            PageBean<TCarStatus> pageData = new PageBean<>(page, limit, countNums);
            pageData.setItems(TCarStatuss);
            return pageData;
        }
    /**
    * 查询
    * @param tCarStatus
    * @return
    */
    public List<TCarStatus> getTCarStatus(TCarStatus tCarStatus){
    List<TCarStatus>  TCarStatuss=tCarStatusMapper.selectByExample(setCriteria(tCarStatus));
    return TCarStatuss;
    }
    /**
    * 更新
    * @param tCarStatus
    * @return
    */
    public String UpdateTCarStatus(TCarStatus tCarStatus)
    {
            String result="";
            try{
            if(tCarStatus.getId()!=null){
            tCarStatusMapper.updateByPrimaryKeySelective(tCarStatus);
            }
            else
            {
            tCarStatusMapper.insertSelective(tCarStatus);
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
    public String DeleteTCarStatus(Integer id){
    tCarStatusMapper.deleteByPrimaryKey(id);
    return "删除成功";
    }

    /**
    * 根据ID查询
    * @param id
    * @return
    */
    public TCarStatus getTCarStatusByID(Integer id) {
    return  tCarStatusMapper.selectByPrimaryKey(id);
    }
}
