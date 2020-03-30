package com.produce.service.impl;

import com.produce.dao.TJournalProcessMapper;
import com.produce.entity.TJournalProcess;
import com.produce.service.TJournalProcessService;
import com.produce.entity.TJournalProcessCriteria;
import com.produce.util.PageBean;
import org.springframework.stereotype.Service;
import com.github.pagehelper.PageHelper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

/**
* @Description: TJournalProcessService接口实现类
* @author 李书瀚
* @date 2020/03/30 11:37
*/
@Service
public class TJournalProcessServiceImpl  implements TJournalProcessService {

    private  static final Logger logger= LoggerFactory.getLogger( TJournalProcessServiceImpl.class);
    @Autowired
    private TJournalProcessMapper tJournalProcessMapper;

    /**
    * 设置查询条件
    * @param tJournalProcess
    * @return
    */
    private  TJournalProcessCriteria setCriteria(TJournalProcess tJournalProcess){
        TJournalProcessCriteria tJournalProcessCriteria= new TJournalProcessCriteria();
        if(tJournalProcess!=null){
        TJournalProcessCriteria.Criteria criteria=tJournalProcessCriteria.createCriteria();
        if(tJournalProcess.getId()!=null){
        criteria.andIdEqualTo(tJournalProcess.getId());
        }

        }
        return  tJournalProcessCriteria;
    }
    /**
    * 获取数据总量
    * @param tJournalProcess
    * @return
    */
    private Integer getCount(TJournalProcess tJournalProcess){
    Integer total =(int)tJournalProcessMapper.countByExample(setCriteria(tJournalProcess));
    return total;
    }
    /**
    *查询(分页)
    * @param tJournalProcess
    * @param page
    * @param limit
    * @return
    */
    public PageBean<TJournalProcess> getTJournalProcessbyPage(TJournalProcess tJournalProcess, Integer page, Integer limit){
        PageHelper.startPage(page, limit,"id desc");
        List<TJournalProcess> TJournalProcesss=getTJournalProcess(tJournalProcess);
            Integer countNums =getCount(tJournalProcess);
            PageBean<TJournalProcess> pageData = new PageBean<>(page, limit, countNums);
            pageData.setItems(TJournalProcesss);
            return pageData;
        }
    /**
    * 查询
    * @param tJournalProcess
    * @return
    */
    public List<TJournalProcess> getTJournalProcess(TJournalProcess tJournalProcess){
    List<TJournalProcess>  TJournalProcesss=tJournalProcessMapper.selectByExample(setCriteria(tJournalProcess));
    return TJournalProcesss;
    }
    /**
    * 更新
    * @param tJournalProcess
    * @return
    */
    public String UpdateTJournalProcess(TJournalProcess tJournalProcess)
    {
            String result="";
            try{
            if(tJournalProcess.getId()!=null){
            tJournalProcessMapper.updateByPrimaryKeySelective(tJournalProcess);
            }
            else
            {
            tJournalProcessMapper.insertSelective(tJournalProcess);
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
    public String DeleteTJournalProcess(Integer id){
    tJournalProcessMapper.deleteByPrimaryKey(id);
    return "删除成功";
    }

    /**
    * 根据ID查询
    * @param id
    * @return
    */
    public TJournalProcess getTJournalProcessByID(Integer id) {
    return  tJournalProcessMapper.selectByPrimaryKey(id);
    }
}
