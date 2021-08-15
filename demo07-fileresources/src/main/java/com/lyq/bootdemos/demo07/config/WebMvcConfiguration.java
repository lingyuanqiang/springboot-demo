package com.lyq.bootdemos.demo07.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author: Y-Ling
 * description:
 * created_time: 2021/8/14 20:07
 */
@Configuration
public class WebMvcConfiguration implements WebMvcConfigurer {

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/code/**").addResourceLocations("file:${web.upload-path}");
        registry.addResourceHandler("/test/**").addResourceLocations("file:C://Users//Ling//Pictures//test/");
    }
}
