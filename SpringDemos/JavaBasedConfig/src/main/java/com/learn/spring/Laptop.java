package com.learn.spring;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Primary
@Scope("prototype")
public class Laptop implements Computer{
    public void compileMethod(){
        System.out.println("Compiling from Laptop Class");
    }
}
