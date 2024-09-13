package com.learn.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Work {

    @Value("25")
    private int age;

    @Autowired
   // @Qualifier("laptop")
    private Computer comp;
    public void code() {
        System.out.println("Coding from Work class");
        comp.compileMethod();
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Computer getComp() {
        return comp;
    }

    public void setComp(Computer comp) {
        this.comp = comp;
    }


}
