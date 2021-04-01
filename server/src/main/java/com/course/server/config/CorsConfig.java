//package com.course.server.config;
//
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.cors.CorsConfiguration;
//import org.springframework.web.servlet.config.annotation.CorsRegistry;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
//
////CORS,Cross-Origin Resource Sharing跨站点资源分享，属于跨域问题。同个IP的不同端口间的访问也属于跨域。前后端分离必然有跨域问题
////解决跨域问题，增加CorsConfig.java
//@Configuration
//public class CorsConfig implements WebMvcConfigurer {
//
//    @Override
//    public void addCorsMappings(CorsRegistry registry) {
//        registry.addMapping("/**")
//                .allowedOrigins("*")
//                .allowedHeaders(CorsConfiguration.ALL)
//                .allowedMethods(CorsConfiguration.ALL)
//                .allowCredentials(true)
//                .maxAge(3600); // 1小时内不需要再预检（发OPTIONS请求）
//    }
//
//}

//统一放在gateway
