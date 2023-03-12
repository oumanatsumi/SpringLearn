package com.ouma.pojo;

import org.springframework.beans.factory.annotation.Autowired;


public class Student {

    private int age;
    private int height;
    public void say(){
        System.out.println("xuesheng");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
