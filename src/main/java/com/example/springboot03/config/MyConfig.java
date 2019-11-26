package com.example.springboot03.config;

import com.example.springboot03.component.LoginHandlerInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
@Configuration
public class MyConfig implements WebMvcConfigurer {
    // 这个方法用来注册拦截器，我们自己写好的拦截器需要通过这里添加注册才能生效
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
       registry.addInterceptor(new LoginHandlerInterceptor())
                .addPathPatterns("/**")
                .excludePathPatterns("/","/index.html","/user/login")
        .excludePathPatterns("/asserts/**");
    }


   // 这个方法是用来配置静态资源的，比如html，js，css，等等
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/static/**").addResourceLocations("classpath:/static/**");
    }


    //浏览器资源映射
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("/login.html");
        registry.addViewController("/index.html").setViewName("/login.html");
        registry.addViewController("/main.html").setViewName("/dashboard.html");
    }
    @Bean
    public LoginHandlerInterceptor loginHandlerInterceptor(){
        return new LoginHandlerInterceptor();
    }

}
