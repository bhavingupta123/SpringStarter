package com.example.springcomponents;

import org.springframework.stereotype.Component;

@Component
public class ScienceTeacher implements Teacher{

    @Override
    public void teach() {
        System.out.println("i am science teacher");
    }
}
