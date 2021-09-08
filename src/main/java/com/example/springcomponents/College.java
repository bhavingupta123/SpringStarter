package com.example.springcomponents;

import org.springframework.stereotype.Component;

@Component
public class College {

    private Principal principal;

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
