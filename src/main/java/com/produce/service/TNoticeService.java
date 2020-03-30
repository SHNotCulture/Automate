package com.produce.service;

import com.produce.entity.TNotice;
import com.produce.util.PageBean;

import java.util.List;

/**
* @Description: TNoticeService接口
* @author 李书瀚
* @date 2020/03/30 11:37
*/
public interface TNoticeService {
    PageBean<TNotice> getTNoticebyPage(TNotice tNotice, Integer page, Integer limit);
    List<TNotice> getTNotice(TNotice tNotice);
    String UpdateTNotice(TNotice tNotice);
    String DeleteTNotice(Integer id);
    TNotice getTNoticeByID(Integer id);

}