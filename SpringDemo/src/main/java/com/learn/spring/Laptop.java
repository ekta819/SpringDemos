package com.learn.spring;

public class Laptop implements Computer {

  /*  public Laptop(){
        System.out.println("Laptop Obj created");
    }*/
    @Override
    public void lapMethod(){
        System.out.println("Compiling from Laptop class");
    }
}
