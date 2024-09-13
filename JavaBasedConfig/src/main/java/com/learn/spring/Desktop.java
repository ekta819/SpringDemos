package com.learn.spring;

import org.springframework.stereotype.Component;

@Component
public class Desktop implements Computer{
    public void compileMethod(){
        System.out.println("Compiling from Desktop Class");
    }
}
