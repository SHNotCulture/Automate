package com.produce.service.impl;

import com.produce.dao.TCarRecordMapper;
import com.produce.entity.TCarRecord;
import com.produce.service.TCarRecordService;
import com.produce.entity.TCarRecordCriteria;
import com.produce.util.PageBean;
import org.springframework.stereotype.Service;
import com.github.pagehelper.PageHelper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

/**
* @Description: TCarRecordService接口实现类
* @author 李书瀚
* @date 2020/03/30 11:37
*/
@Service
public class TCarRecordServiceImpl  implements TCarRecordService {

    private  static final Logger logger= LoggerFactory.getLogger( TCarRecordServiceImpl.class);
    @Autowired
    private TCarRecordMapper tCarRecordMapper;

    /**
    * 设置查询条件
    * @param tCarRecord
    * @return
    */
    private  TCarRecordCriteria setCriteria(TCarRecord tCarRecord){
        TCarRecordCriteria tCarRecordCriteria= new TCarRecordCriteria();
        if(tCarRecord!=null){
        TCarRecordCriteria.Criteria criteria=tCarRecordCriteria.createCriteria();
        if(tCarRecord.getId()!=null){
        criteria.andIdEqualTo(tCarRecord.getId());
        }

        }
        return  tCarRecordCriteria;
    }
    /**
    * 获取数据总量
    * @param tCarRecord
    * @return
    */
    private Integer getCount(TCarRecord tCarRecord){
    Integer total =(int)tCarRecordMapper.countByExample(setCriteria(tCarRecord));
    return total;
    }
    /**
    *查询(分页)
    * @param tCarRecord
    * @param page
    * @param limit
    * @return
    */
    public PageBean<TCarRecord> getTCarRecordbyPage(TCarRecord tCarRecord, Integer page, Integer limit){
        PageHelper.startPage(page, limit,"id desc");
        List<TCarRecord> TCarRecords=getTCarRecord(tCarRecord);
            Integer countNums =getCount(tCarRecord);
            PageBean<TCarRecord> pageData = new PageBean<>(page, limit, countNums);
            pageData.setItems(TCarRecords);
            return pageData;
        }
    /**
    * 查询
    * @param tCarRecord
    * @return
    */
    public List<TCarRecord> getTCarRecord(TCarRecord tCarRecord){
    List<TCarRecord>  TCarRecords=tCarRecordMapper.selectByExample(setCriteria(tCarRecord));
    return TCarRecords;
    }
    /**
    * 更新
    * @param tCarRecord
    * @return
    */
    public String UpdateTCarRecord(TCarRecord tCarRecord)
    {
            String result="";
            try{
            if(tCarRecord.getId()!=null){
            tCarRecordMapper.updateByPrimaryKeySelective(tCarRecord);
            }
            else
            {
            tCarRecordMapper.insertSelective(tCarRecord);
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
    public String DeleteTCarRecord(Integer id){
    tCarRecordMapper.deleteByPrimaryKey(id);
    return "删除成功";
    }

    /**
    * 根据ID查询
    * @param id
    * @return
    */
    public TCarRecord getTCarRecordByID(Integer id) {
    return  tCarRecordMapper.selectByPrimaryKey(id);
    }
}
