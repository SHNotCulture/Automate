package com.produce.service;

import com.produce.entity.TCarStatus;
import com.produce.util.PageBean;

import java.util.List;

/**
* @Description: TCarStatusService接口
* @author 李书瀚
* @date 2020/03/30 11:37
*/
public interface TCarStatusService {
    PageBean<TCarStatus> getTCarStatusbyPage(TCarStatus tCarStatus, Integer page, Integer limit);
    List<TCarStatus> getTCarStatus(TCarStatus tCarStatus);
    String UpdateTCarStatus(TCarStatus tCarStatus);
    String DeleteTCarStatus(Integer id);
    TCarStatus getTCarStatusByID(Integer id);

}