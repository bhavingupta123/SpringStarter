package com.example.springcomponents;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages="com.example.springcomponents")

public class CollegeConfig {

    @Bean
    public Principal principal(){
        return new Principal();
    }

    @Bean
    public College college(){
        return new College(principal());
    }
}
