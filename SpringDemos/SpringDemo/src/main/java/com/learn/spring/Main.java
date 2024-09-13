package com.learn.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello and welcome!");
        ApplicationContext context=new ClassPathXmlApplicationContext("context.xml");
       Work obj1= context.getBean("work", Work.class);
        obj1.code();
        System.out.println(obj1.getAge());

     /*   Work obj2= (Work) context.getBean("work1");
        obj2.code();
        System.out.println(obj2.age);
        System.out.println(obj2==obj1);*/
        //true & age =21 for both,
        // here both obj1 & obj2 are referring to the same object.


        }
    }
