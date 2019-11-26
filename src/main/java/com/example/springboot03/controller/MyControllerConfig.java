package com.example.springboot03.controller;

import com.example.springboot03.filter.MyFilter;
import com.example.springboot03.listener.MyListener;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

//@Configuration
public class MyControllerConfig {

//    //过滤器
//   @Bean
//    public FilterRegistrationBean filterRegistrationBean(){
//        FilterRegistrationBean bean=new FilterRegistrationBean();
//        bean.setFilter(new MyFilter());
//        bean.setUrlPatterns(Arrays.asList("/*"));
//        bean.setName("TestFilter");
//        return  bean;
//    }
    //监听器
//    @Bean
    public ServletListenerRegistrationBean servletListenerRegistrationBean(){
       ServletListenerRegistrationBean bean=new ServletListenerRegistrationBean();
       bean.setListener(new MyListener());
       return bean;
    }
}
