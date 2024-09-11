package com.learn.spring;

public class Desktop implements Computer {
  /*  public Desktop(){
        System.out.println("From Computer Class");
    }*/
    @Override
    public void lapMethod(){
        System.out.println("Compiling from Desktop class");
    }
}
