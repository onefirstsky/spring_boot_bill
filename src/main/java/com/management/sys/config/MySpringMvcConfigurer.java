package com.management.sys.config;

import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

public class MySpringMvcConfigurer {
    @Bean
    public WebMvcConfigurer MySpringMvcConfigurer(){
   return new WebMvcConfigurer(){
        @Override
        public void addViewControllers(ViewControllerRegistry registry) {
            //dd
            registry.addViewController("/").setViewName("main/login");
            registry.addViewController("/index.html").setViewName("main/login");
        }
    };
    }
}
