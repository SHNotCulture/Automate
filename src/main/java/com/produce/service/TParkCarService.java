package com.produce.service;

import com.produce.entity.TParkCar;
import com.produce.util.PageBean;

import java.util.List;

/**
* @Description: TParkCarService接口
* @author 李书瀚
* @date 2020/03/30 11:37
*/
public interface TParkCarService {
    PageBean<TParkCar> getTParkCarbyPage(TParkCar tParkCar, Integer page, Integer limit);
    List<TParkCar> getTParkCar(TParkCar tParkCar);
    String UpdateTParkCar(TParkCar tParkCar);
    String DeleteTParkCar(Integer id);
    TParkCar getTParkCarByID(Integer id);

}