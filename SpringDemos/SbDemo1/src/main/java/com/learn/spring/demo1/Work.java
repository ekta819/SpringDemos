package com.learn.spring.demo1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Work {
    // @Autowired
    private int age ;
    private Computer comp;
    public void code(){
        System.out.println("Coding from Work class");
        comp.compile();
    }

    public int getAge() {
        return age;
    }

    @Value("20")
    public void setAge(int age) {
        this.age = age;
    }

    public Computer getComp() {
        return comp;
    }

    @Autowired
    @Qualifier("laptop")
    public void setComp(Computer comp) {
        this.comp = comp;
    }
}
