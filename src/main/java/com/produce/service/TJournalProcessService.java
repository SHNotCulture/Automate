package com.produce.service;

import com.produce.entity.TJournalProcess;
import com.produce.util.PageBean;

import java.util.List;

/**
* @Description: TJournalProcessService接口
* @author 李书瀚
* @date 2020/03/30 11:37
*/
public interface TJournalProcessService {
    PageBean<TJournalProcess> getTJournalProcessbyPage(TJournalProcess tJournalProcess, Integer page, Integer limit);
    List<TJournalProcess> getTJournalProcess(TJournalProcess tJournalProcess);
    String UpdateTJournalProcess(TJournalProcess tJournalProcess);
    String DeleteTJournalProcess(Integer id);
    TJournalProcess getTJournalProcessByID(Integer id);

}