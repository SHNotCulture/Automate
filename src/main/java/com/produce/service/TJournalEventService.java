package com.produce.service;

import com.produce.entity.TJournalEvent;
import com.produce.util.PageBean;

import java.util.List;

/**
* @Description: TJournalEventService接口
* @author 李书瀚
* @date 2020/03/30 11:37
*/
public interface TJournalEventService {
    PageBean<TJournalEvent> getTJournalEventbyPage(TJournalEvent tJournalEvent, Integer page, Integer limit);
    List<TJournalEvent> getTJournalEvent(TJournalEvent tJournalEvent);
    String UpdateTJournalEvent(TJournalEvent tJournalEvent);
    String DeleteTJournalEvent(Integer id);
    TJournalEvent getTJournalEventByID(Integer id);

}