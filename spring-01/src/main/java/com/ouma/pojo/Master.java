package com.ouma.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

public class Master {
    @Autowired
    private Student student;
    @Autowired
    private Teacher teacher;
    public void say(){
        System.out.println("Student:" );
        getStudent().say();
        System.out.println("Teacher:" );
        getTeacher().say();
    }

    public Student getStudent() {
        return student;
    }


    public Teacher getTeacher() {
        return teacher;
    }

}
