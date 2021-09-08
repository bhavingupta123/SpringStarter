package com.example.springcomponents;

import org.springframework.context.annotation.*;

@Configuration
@ComponentScan(basePackages="com.example.springcomponents")
//@PropertySource("classpath:college-info.properties")
public class CollegeConfig {

    /*@Bean
    public Teacher mathteacher(){

        return new MathTeacher();
    }

    @Bean
    public Principal principal(){
        return new Principal();
    }

    @Bean
    public College college(){
        College obj = new College();
        obj.setPrincipal(principal());
        obj.setTeacher(mathteacher());
        return obj;
    }*/
}
