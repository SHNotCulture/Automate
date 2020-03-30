package com.produce.service;

import com.produce.entity.TOwnerPlot;
import com.produce.util.PageBean;

import java.util.List;

/**
* @Description: TOwnerPlotService接口
* @author 李书瀚
* @date 2020/03/30 11:37
*/
public interface TOwnerPlotService {
    PageBean<TOwnerPlot> getTOwnerPlotbyPage(TOwnerPlot tOwnerPlot, Integer page, Integer limit);
    List<TOwnerPlot> getTOwnerPlot(TOwnerPlot tOwnerPlot);
    String UpdateTOwnerPlot(TOwnerPlot tOwnerPlot);
    String DeleteTOwnerPlot(Integer id);
    TOwnerPlot getTOwnerPlotByID(Integer id);

}