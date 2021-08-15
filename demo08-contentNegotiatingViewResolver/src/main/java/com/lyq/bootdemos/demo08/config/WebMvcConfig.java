package com.lyq.bootdemos.demo08.config;

import com.lyq.bootdemos.demo08.resolver.ExcelViewResolver;
import com.lyq.bootdemos.demo08.resolver.HtmlViewResolver;
import com.lyq.bootdemos.demo08.resolver.PdfViewResolver;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ContentNegotiationConfigurer;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author: Y-Ling
 * description:
 * created_time: 2021/8/15 20:06
 */
@Configuration
public class WebMvcConfig implements WebMvcConfigurer {

    @Override
    public void configureViewResolvers(ViewResolverRegistry registry) {
        registry.enableContentNegotiation(new PdfViewResolver());
        registry.enableContentNegotiation(new ExcelViewResolver());
        registry.enableContentNegotiation(new HtmlViewResolver());
        registry.enableContentNegotiation(false);
    }

}
