package com.produce.service.impl;

import com.produce.dao.TPaySequenceMapper;
import com.produce.entity.TPaySequence;
import com.produce.service.TPaySequenceService;
import com.produce.entity.TPaySequenceCriteria;
import com.produce.util.PageBean;
import org.springframework.stereotype.Service;
import com.github.pagehelper.PageHelper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

/**
* @Description: TPaySequenceService接口实现类
* @author 李书瀚
* @date 2020/03/30 11:37
*/
@Service
public class TPaySequenceServiceImpl  implements TPaySequenceService {

    private  static final Logger logger= LoggerFactory.getLogger( TPaySequenceServiceImpl.class);
    @Autowired
    private TPaySequenceMapper tPaySequenceMapper;

    /**
    * 设置查询条件
    * @param tPaySequence
    * @return
    */
    private  TPaySequenceCriteria setCriteria(TPaySequence tPaySequence){
        TPaySequenceCriteria tPaySequenceCriteria= new TPaySequenceCriteria();
        if(tPaySequence!=null){
        TPaySequenceCriteria.Criteria criteria=tPaySequenceCriteria.createCriteria();
        if(tPaySequence.getId()!=null){
        criteria.andIdEqualTo(tPaySequence.getId());
        }

        }
        return  tPaySequenceCriteria;
    }
    /**
    * 获取数据总量
    * @param tPaySequence
    * @return
    */
    private Integer getCount(TPaySequence tPaySequence){
    Integer total =(int)tPaySequenceMapper.countByExample(setCriteria(tPaySequence));
    return total;
    }
    /**
    *查询(分页)
    * @param tPaySequence
    * @param page
    * @param limit
    * @return
    */
    public PageBean<TPaySequence> getTPaySequencebyPage(TPaySequence tPaySequence, Integer page, Integer limit){
        PageHelper.startPage(page, limit,"id desc");
        List<TPaySequence> TPaySequences=getTPaySequence(tPaySequence);
            Integer countNums =getCount(tPaySequence);
            PageBean<TPaySequence> pageData = new PageBean<>(page, limit, countNums);
            pageData.setItems(TPaySequences);
            return pageData;
        }
    /**
    * 查询
    * @param tPaySequence
    * @return
    */
    public List<TPaySequence> getTPaySequence(TPaySequence tPaySequence){
    List<TPaySequence>  TPaySequences=tPaySequenceMapper.selectByExample(setCriteria(tPaySequence));
    return TPaySequences;
    }
    /**
    * 更新
    * @param tPaySequence
    * @return
    */
    public String UpdateTPaySequence(TPaySequence tPaySequence)
    {
            String result="";
            try{
            if(tPaySequence.getId()!=null){
            tPaySequenceMapper.updateByPrimaryKeySelective(tPaySequence);
            }
            else
            {
            tPaySequenceMapper.insertSelective(tPaySequence);
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
    public String DeleteTPaySequence(Integer id){
    tPaySequenceMapper.deleteByPrimaryKey(id);
    return "删除成功";
    }

    /**
    * 根据ID查询
    * @param id
    * @return
    */
    public TPaySequence getTPaySequenceByID(Integer id) {
    return  tPaySequenceMapper.selectByPrimaryKey(id);
    }
}
