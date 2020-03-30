package com.produce.service.impl;

import com.produce.dao.TOwnerPlotMapper;
import com.produce.entity.TOwnerPlot;
import com.produce.service.TOwnerPlotService;
import com.produce.entity.TOwnerPlotCriteria;
import com.produce.util.PageBean;
import org.springframework.stereotype.Service;
import com.github.pagehelper.PageHelper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

/**
* @Description: TOwnerPlotService接口实现类
* @author 李书瀚
* @date 2020/03/30 11:37
*/
@Service
public class TOwnerPlotServiceImpl  implements TOwnerPlotService {

    private  static final Logger logger= LoggerFactory.getLogger( TOwnerPlotServiceImpl.class);
    @Autowired
    private TOwnerPlotMapper tOwnerPlotMapper;

    /**
    * 设置查询条件
    * @param tOwnerPlot
    * @return
    */
    private  TOwnerPlotCriteria setCriteria(TOwnerPlot tOwnerPlot){
        TOwnerPlotCriteria tOwnerPlotCriteria= new TOwnerPlotCriteria();
        if(tOwnerPlot!=null){
        TOwnerPlotCriteria.Criteria criteria=tOwnerPlotCriteria.createCriteria();
        if(tOwnerPlot.getId()!=null){
        criteria.andIdEqualTo(tOwnerPlot.getId());
        }

        }
        return  tOwnerPlotCriteria;
    }
    /**
    * 获取数据总量
    * @param tOwnerPlot
    * @return
    */
    private Integer getCount(TOwnerPlot tOwnerPlot){
    Integer total =(int)tOwnerPlotMapper.countByExample(setCriteria(tOwnerPlot));
    return total;
    }
    /**
    *查询(分页)
    * @param tOwnerPlot
    * @param page
    * @param limit
    * @return
    */
    public PageBean<TOwnerPlot> getTOwnerPlotbyPage(TOwnerPlot tOwnerPlot, Integer page, Integer limit){
        PageHelper.startPage(page, limit,"id desc");
        List<TOwnerPlot> TOwnerPlots=getTOwnerPlot(tOwnerPlot);
            Integer countNums =getCount(tOwnerPlot);
            PageBean<TOwnerPlot> pageData = new PageBean<>(page, limit, countNums);
            pageData.setItems(TOwnerPlots);
            return pageData;
        }
    /**
    * 查询
    * @param tOwnerPlot
    * @return
    */
    public List<TOwnerPlot> getTOwnerPlot(TOwnerPlot tOwnerPlot){
    List<TOwnerPlot>  TOwnerPlots=tOwnerPlotMapper.selectByExample(setCriteria(tOwnerPlot));
    return TOwnerPlots;
    }
    /**
    * 更新
    * @param tOwnerPlot
    * @return
    */
    public String UpdateTOwnerPlot(TOwnerPlot tOwnerPlot)
    {
            String result="";
            try{
            if(tOwnerPlot.getId()!=null){
            tOwnerPlotMapper.updateByPrimaryKeySelective(tOwnerPlot);
            }
            else
            {
            tOwnerPlotMapper.insertSelective(tOwnerPlot);
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
    public String DeleteTOwnerPlot(Integer id){
    tOwnerPlotMapper.deleteByPrimaryKey(id);
    return "删除成功";
    }

    /**
    * 根据ID查询
    * @param id
    * @return
    */
    public TOwnerPlot getTOwnerPlotByID(Integer id) {
    return  tOwnerPlotMapper.selectByPrimaryKey(id);
    }
}
