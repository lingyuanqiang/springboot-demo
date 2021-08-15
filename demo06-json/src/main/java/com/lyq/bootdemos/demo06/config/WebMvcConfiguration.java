package com.lyq.bootdemos.demo06.config;

import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.support.config.FastJsonConfig;
import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;
import com.lyq.bootdemos.demo06.annotation.DesensitizationAnnotationFormatterFactory;
import com.lyq.bootdemos.demo06.filter.ValueDesensitizeFilter;
import org.springframework.boot.autoconfigure.http.HttpMessageConverters;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author: Y-Ling
 * description:
 * created_time: 2021/8/14 20:07
 */
@Configuration
public class WebMvcConfiguration implements WebMvcConfigurer {



    @Override
    public void addFormatters(FormatterRegistry registry) {
        registry.addFormatterForFieldAnnotation(new DesensitizationAnnotationFormatterFactory());
    }

//    @Bean
//    public HttpMessageConverters fastJsonHttpMessageConverters(){
//        FastJsonHttpMessageConverter fastJsonHttpMessageConverter = new FastJsonHttpMessageConverter();
//        FastJsonConfig fastJsonConfig = new FastJsonConfig();
//        fastJsonConfig.setSerializerFeatures(SerializerFeature.PrettyFormat);
//        fastJsonConfig.setSerializerFeatures(SerializerFeature.WriteMapNullValue);
//        fastJsonConfig.setSerializeFilters(new ValueDesensitizeFilter());
//        fastJsonHttpMessageConverter.setFastJsonConfig(fastJsonConfig);
//        HttpMessageConverter<?> converter = fastJsonHttpMessageConverter;
//        return new HttpMessageConverters(converter);
//    }
}
