package com.example.springboot03.listener;

import com.example.springboot03.filter.MyFilter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * 监听器
 */
public class MyListener implements ServletContextListener {

    private static Logger logger = LoggerFactory.getLogger(MyFilter.class);


    @Override
    public void contextInitialized(ServletContextEvent sce) {
        logger.info("contextInitialized ...web应用启动");
    }


    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        logger.info("contextDestroyed ...当前web应用销毁");
    }
}
