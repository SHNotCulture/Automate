package com.produce.service;

import com.produce.entity.TCarOwner;
import com.produce.util.PageBean;

import java.util.List;

/**
* @Description: TCarOwnerService接口
* @author 李书瀚
* @date 2020/03/30 11:37
*/
public interface TCarOwnerService {
    PageBean<TCarOwner> getTCarOwnerbyPage(TCarOwner tCarOwner, Integer page, Integer limit);
    List<TCarOwner> getTCarOwner(TCarOwner tCarOwner);
    String UpdateTCarOwner(TCarOwner tCarOwner);
    String DeleteTCarOwner(Integer id);
    TCarOwner getTCarOwnerByID(Integer id);

}