package com.produce.service.impl;

import com.produce.dao.TJournalEventMapper;
import com.produce.entity.TJournalEvent;
import com.produce.service.TJournalEventService;
import com.produce.entity.TJournalEventCriteria;
import com.produce.util.PageBean;
import org.springframework.stereotype.Service;
import com.github.pagehelper.PageHelper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

/**
* @Description: TJournalEventService接口实现类
* @author 李书瀚
* @date 2020/03/30 11:37
*/
@Service
public class TJournalEventServiceImpl  implements TJournalEventService {

    private  static final Logger logger= LoggerFactory.getLogger( TJournalEventServiceImpl.class);
    @Autowired
    private TJournalEventMapper tJournalEventMapper;

    /**
    * 设置查询条件
    * @param tJournalEvent
    * @return
    */
    private  TJournalEventCriteria setCriteria(TJournalEvent tJournalEvent){
        TJournalEventCriteria tJournalEventCriteria= new TJournalEventCriteria();
        if(tJournalEvent!=null){
        TJournalEventCriteria.Criteria criteria=tJournalEventCriteria.createCriteria();
        if(tJournalEvent.getId()!=null){
        criteria.andIdEqualTo(tJournalEvent.getId());
        }

        }
        return  tJournalEventCriteria;
    }
    /**
    * 获取数据总量
    * @param tJournalEvent
    * @return
    */
    private Integer getCount(TJournalEvent tJournalEvent){
    Integer total =(int)tJournalEventMapper.countByExample(setCriteria(tJournalEvent));
    return total;
    }
    /**
    *查询(分页)
    * @param tJournalEvent
    * @param page
    * @param limit
    * @return
    */
    public PageBean<TJournalEvent> getTJournalEventbyPage(TJournalEvent tJournalEvent, Integer page, Integer limit){
        PageHelper.startPage(page, limit,"id desc");
        List<TJournalEvent> TJournalEvents=getTJournalEvent(tJournalEvent);
            Integer countNums =getCount(tJournalEvent);
            PageBean<TJournalEvent> pageData = new PageBean<>(page, limit, countNums);
            pageData.setItems(TJournalEvents);
            return pageData;
        }
    /**
    * 查询
    * @param tJournalEvent
    * @return
    */
    public List<TJournalEvent> getTJournalEvent(TJournalEvent tJournalEvent){
    List<TJournalEvent>  TJournalEvents=tJournalEventMapper.selectByExample(setCriteria(tJournalEvent));
    return TJournalEvents;
    }
    /**
    * 更新
    * @param tJournalEvent
    * @return
    */
    public String UpdateTJournalEvent(TJournalEvent tJournalEvent)
    {
            String result="";
            try{
            if(tJournalEvent.getId()!=null){
            tJournalEventMapper.updateByPrimaryKeySelective(tJournalEvent);
            }
            else
            {
            tJournalEventMapper.insertSelective(tJournalEvent);
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
    public String DeleteTJournalEvent(Integer id){
    tJournalEventMapper.deleteByPrimaryKey(id);
    return "删除成功";
    }

    /**
    * 根据ID查询
    * @param id
    * @return
    */
    public TJournalEvent getTJournalEventByID(Integer id) {
    return  tJournalEventMapper.selectByPrimaryKey(id);
    }
}
