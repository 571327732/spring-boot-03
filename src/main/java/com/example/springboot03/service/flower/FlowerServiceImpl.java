package com.example.springboot03.service.flower;

import com.example.springboot03.dao.FlowerMapper;
import com.example.springboot03.pojo.Flower;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class FlowerServiceImpl implements FlowerService{
    @Autowired
    FlowerMapper flowerMapper;
    @Override
    public List<Flower> getFlowers() {
        return flowerMapper.getFlowers();
    }

    @Override
    public Flower getFlower(Integer fid) {
        return flowerMapper.selectByPrimaryKey(fid);
    }
}
