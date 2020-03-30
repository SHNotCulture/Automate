package com.produce.service;

import com.produce.entity.TPaySequence;
import com.produce.util.PageBean;

import java.util.List;

/**
* @Description: TPaySequenceService接口
* @author 李书瀚
* @date 2020/03/30 11:37
*/
public interface TPaySequenceService {
    PageBean<TPaySequence> getTPaySequencebyPage(TPaySequence tPaySequence, Integer page, Integer limit);
    List<TPaySequence> getTPaySequence(TPaySequence tPaySequence);
    String UpdateTPaySequence(TPaySequence tPaySequence);
    String DeleteTPaySequence(Integer id);
    TPaySequence getTPaySequenceByID(Integer id);

}