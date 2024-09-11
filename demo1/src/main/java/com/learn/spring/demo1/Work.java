package com.learn.spring.demo1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Work {
    @Autowired
    CompileCode comp;
    public void code(){
        System.out.println("Coding from Work class");
        comp.compile();
    }
}
