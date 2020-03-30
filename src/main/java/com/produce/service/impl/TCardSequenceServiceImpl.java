package com.produce.service.impl;

import com.produce.dao.TCardSequenceMapper;
import com.produce.entity.TCardSequence;
import com.produce.service.TCardSequenceService;
import com.produce.entity.TCardSequenceCriteria;
import com.produce.util.PageBean;
import org.springframework.stereotype.Service;
import com.github.pagehelper.PageHelper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

/**
* @Description: TCardSequenceService接口实现类
* @author 李书瀚
* @date 2020/03/30 11:37
*/
@Service
public class TCardSequenceServiceImpl  implements TCardSequenceService {

    private  static final Logger logger= LoggerFactory.getLogger( TCardSequenceServiceImpl.class);
    @Autowired
    private TCardSequenceMapper tCardSequenceMapper;

    /**
    * 设置查询条件
    * @param tCardSequence
    * @return
    */
    private  TCardSequenceCriteria setCriteria(TCardSequence tCardSequence){
        TCardSequenceCriteria tCardSequenceCriteria= new TCardSequenceCriteria();
        if(tCardSequence!=null){
        TCardSequenceCriteria.Criteria criteria=tCardSequenceCriteria.createCriteria();
        if(tCardSequence.getId()!=null){
        criteria.andIdEqualTo(tCardSequence.getId());
        }

        }
        return  tCardSequenceCriteria;
    }
    /**
    * 获取数据总量
    * @param tCardSequence
    * @return
    */
    private Integer getCount(TCardSequence tCardSequence){
    Integer total =(int)tCardSequenceMapper.countByExample(setCriteria(tCardSequence));
    return total;
    }
    /**
    *查询(分页)
    * @param tCardSequence
    * @param page
    * @param limit
    * @return
    */
    public PageBean<TCardSequence> getTCardSequencebyPage(TCardSequence tCardSequence, Integer page, Integer limit){
        PageHelper.startPage(page, limit,"id desc");
        List<TCardSequence> TCardSequences=getTCardSequence(tCardSequence);
            Integer countNums =getCount(tCardSequence);
            PageBean<TCardSequence> pageData = new PageBean<>(page, limit, countNums);
            pageData.setItems(TCardSequences);
            return pageData;
        }
    /**
    * 查询
    * @param tCardSequence
    * @return
    */
    public List<TCardSequence> getTCardSequence(TCardSequence tCardSequence){
    List<TCardSequence>  TCardSequences=tCardSequenceMapper.selectByExample(setCriteria(tCardSequence));
    return TCardSequences;
    }
    /**
    * 更新
    * @param tCardSequence
    * @return
    */
    public String UpdateTCardSequence(TCardSequence tCardSequence)
    {
            String result="";
            try{
            if(tCardSequence.getId()!=null){
            tCardSequenceMapper.updateByPrimaryKeySelective(tCardSequence);
            }
            else
            {
            tCardSequenceMapper.insertSelective(tCardSequence);
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
    public String DeleteTCardSequence(Integer id){
    tCardSequenceMapper.deleteByPrimaryKey(id);
    return "删除成功";
    }

    /**
    * 根据ID查询
    * @param id
    * @return
    */
    public TCardSequence getTCardSequenceByID(Integer id) {
    return  tCardSequenceMapper.selectByPrimaryKey(id);
    }
}
