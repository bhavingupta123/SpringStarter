package com.example.springcomponents;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class College {

    @Value("bhavin")
    private String namec;

    @Autowired
    private Principal principal;

    @Qualifier("scienceTeacher")
    @Autowired
    private Teacher teacher;

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    /*public College(Principal principal) {
        this.principal = principal;
    }*/

    public void setPrincipal(Principal principal) {
        this.principal = principal;
    }

    public void  test(){
        principal.principalInfo();
        System.out.println("testing ");
        teacher.teach();
        System.out.println(namec);
    }
}
