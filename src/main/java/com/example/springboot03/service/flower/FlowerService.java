package com.example.springboot03.service.flower;

import com.example.springboot03.pojo.Flower;

import java.util.List;

public interface FlowerService {
    //获取flower集合
    List<Flower> getFlowers();
    //根据id查询flower
    Flower getFlower(Integer fid);
}
