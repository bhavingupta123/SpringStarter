package com.example.springcomponents;

import org.springframework.stereotype.Component;

@Component
public class MathTeacher implements Teacher{

    @Override
    public void teach() {

        System.out.println("math tacher is me ");
    }
}
