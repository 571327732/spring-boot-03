package com.example.springboot03.controller;

import com.example.springboot03.pojo.Flower;
import com.example.springboot03.service.flower.FlowerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;


import java.util.List;


@Controller
public class FlowerController {

    @Autowired
    FlowerService flowerService;

    @GetMapping("/flowers")
    public String flowers(Model model) {
        List<Flower> flowers = flowerService.getFlowers();
        model.addAttribute("flowers", flowers);
        return "/flower/list";
    }

    //页面跳转(修改页面)
    @GetMapping("/flower/{fid}")
    public String putFlowerPage(@PathVariable("fid") Integer fid, Model model) {
        Flower flower = flowerService.getFlower(fid);
        model.addAttribute("flower", flower);
        return "/flower/putflower";
    }

    @PutMapping("/flower")
    public String putFlower(Flower flower) {
        //更改

        return "redirect:/flowers";
    }

    //添加页面
    @GetMapping("/flower")
    public String addFlowerPage(Model model) {

        return "/flower/addflower";
    }

    //添加
    @PostMapping("/flower")
    public String addFlower(Flower flower) {
        //新增

        return "redirect:/flowers";
    }
}
