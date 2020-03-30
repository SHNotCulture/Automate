package com.produce.service;

import com.produce.entity.TCarRecord;
import com.produce.util.PageBean;

import java.util.List;

/**
* @Description: TCarRecordService接口
* @author 李书瀚
* @date 2020/03/30 11:37
*/
public interface TCarRecordService {
    PageBean<TCarRecord> getTCarRecordbyPage(TCarRecord tCarRecord, Integer page, Integer limit);
    List<TCarRecord> getTCarRecord(TCarRecord tCarRecord);
    String UpdateTCarRecord(TCarRecord tCarRecord);
    String DeleteTCarRecord(Integer id);
    TCarRecord getTCarRecordByID(Integer id);

}