package com.lumen.test.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "com.lumen.test")
@PropertySource("classpath:application.properties")
public class SpringConfig {

}
