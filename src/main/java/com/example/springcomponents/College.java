package com.example.springcomponents;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class College {

    @Autowired
    private Principal principal;

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
    }
}
