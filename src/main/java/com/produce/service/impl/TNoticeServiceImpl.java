package com.produce.service.impl;

import com.produce.dao.TNoticeMapper;
import com.produce.entity.TNotice;
import com.produce.service.TNoticeService;
import com.produce.entity.TNoticeCriteria;
import com.produce.util.PageBean;
import org.springframework.stereotype.Service;
import com.github.pagehelper.PageHelper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

/**
* @Description: TNoticeService接口实现类
* @author 李书瀚
* @date 2020/03/30 11:37
*/
@Service
public class TNoticeServiceImpl  implements TNoticeService {

    private  static final Logger logger= LoggerFactory.getLogger( TNoticeServiceImpl.class);
    @Autowired
    private TNoticeMapper tNoticeMapper;

    /**
    * 设置查询条件
    * @param tNotice
    * @return
    */
    private  TNoticeCriteria setCriteria(TNotice tNotice){
        TNoticeCriteria tNoticeCriteria= new TNoticeCriteria();
        if(tNotice!=null){
        TNoticeCriteria.Criteria criteria=tNoticeCriteria.createCriteria();
        if(tNotice.getId()!=null){
        criteria.andIdEqualTo(tNotice.getId());
        }

        }
        return  tNoticeCriteria;
    }
    /**
    * 获取数据总量
    * @param tNotice
    * @return
    */
    private Integer getCount(TNotice tNotice){
    Integer total =(int)tNoticeMapper.countByExample(setCriteria(tNotice));
    return total;
    }
    /**
    *查询(分页)
    * @param tNotice
    * @param page
    * @param limit
    * @return
    */
    public PageBean<TNotice> getTNoticebyPage(TNotice tNotice, Integer page, Integer limit){
        PageHelper.startPage(page, limit,"id desc");
        List<TNotice> TNotices=getTNotice(tNotice);
            Integer countNums =getCount(tNotice);
            PageBean<TNotice> pageData = new PageBean<>(page, limit, countNums);
            pageData.setItems(TNotices);
            return pageData;
        }
    /**
    * 查询
    * @param tNotice
    * @return
    */
    public List<TNotice> getTNotice(TNotice tNotice){
    List<TNotice>  TNotices=tNoticeMapper.selectByExample(setCriteria(tNotice));
    return TNotices;
    }
    /**
    * 更新
    * @param tNotice
    * @return
    */
    public String UpdateTNotice(TNotice tNotice)
    {
            String result="";
            try{
            if(tNotice.getId()!=null){
            tNoticeMapper.updateByPrimaryKeySelective(tNotice);
            }
            else
            {
            tNoticeMapper.insertSelective(tNotice);
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
    public String DeleteTNotice(Integer id){
    tNoticeMapper.deleteByPrimaryKey(id);
    return "删除成功";
    }

    /**
    * 根据ID查询
    * @param id
    * @return
    */
    public TNotice getTNoticeByID(Integer id) {
    return  tNoticeMapper.selectByPrimaryKey(id);
    }
}
