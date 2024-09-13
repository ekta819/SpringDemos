package com.learn.spring.demo1;

import org.springframework.stereotype.Component;

@Component
public class Laptop implements Computer{
    @Override
    public void compile(){
        System.out.println("Compiling from Laptop Class");
    }
}
