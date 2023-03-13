package ouma.pojo;

import org.springframework.beans.factory.annotation.Autowired;

public class Teacher {
    private int age;
    private String name;
    public void say(){
        System.out.println("laoshi");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
