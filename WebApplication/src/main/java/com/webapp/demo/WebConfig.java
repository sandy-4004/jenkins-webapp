//package com.webapp.demo;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.servlet.ViewResolver;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
//import org.springframework.web.servlet.view.InternalResourceViewResolver;
//
//@Configuration
//public class WebConfig implements WebMvcConfigurer {
//    
//    @Bean
//    public ViewResolver jspViewResolver() {
//        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
//        resolver.setPrefix("/WEB-INF/jsp/");  // Adjust the prefix based on your actual directory structure
//        resolver.setSuffix(".jsp");
//        return resolver;
//    }
//
//    // Other configurations as needed...
//}
