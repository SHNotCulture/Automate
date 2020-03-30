package com.produce.service;

import com.produce.entity.TCardSequence;
import com.produce.util.PageBean;

import java.util.List;

/**
* @Description: TCardSequenceService接口
* @author 李书瀚
* @date 2020/03/30 11:37
*/
public interface TCardSequenceService {
    PageBean<TCardSequence> getTCardSequencebyPage(TCardSequence tCardSequence, Integer page, Integer limit);
    List<TCardSequence> getTCardSequence(TCardSequence tCardSequence);
    String UpdateTCardSequence(TCardSequence tCardSequence);
    String DeleteTCardSequence(Integer id);
    TCardSequence getTCardSequenceByID(Integer id);

}