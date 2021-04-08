package com.course.file.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class SpringMvcConfig implements WebMvcConfigurer {

//    @Value("${file.path}")
//    private String FILE_PATH;
//
//    @Override
//    public void addResourceHandlers(ResourceHandlerRegistry registry) {
//        registry.addResourceHandler("/f/**").addResourceLocations("file:" + FILE_PATH);
//    }
}