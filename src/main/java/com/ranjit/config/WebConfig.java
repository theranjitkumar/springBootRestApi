package com.ranjit.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.thymeleaf.spring5.SpringTemplateEngine;

import nz.net.ultraq.thymeleaf.LayoutDialect;

@Configuration
@ComponentScan
public class WebConfig {

    // @Bean
    // public SpringTemplateEngine templateEngine() {
    //     SpringTemplateEngine templateEngine = new SpringTemplateEngine();
    //     templateEngine.addDialect(new LayoutDialect());
    //     return templateEngine;
    // }

}
