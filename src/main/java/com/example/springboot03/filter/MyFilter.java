package com.example.springboot03.filter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * 过滤器
 */
public class MyFilter implements Filter {

    private static Logger logger= LoggerFactory.getLogger(MyFilter.class);
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        logger.info("My Filter ....init  初始化器..........................................");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest request1=(HttpServletRequest)request;
        logger.info("My Filter ....doFilter  过滤到的请求:--------------------------->>>>>",request1.getRequestURI());
        chain.doFilter(request,response);
    }

    @Override
    public void destroy() {
        logger.info("My Filter ....destroy   销毁..........................................");
    }
}
