package com.learn.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello and welcome!");
        ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
//        Desktop dt1=context.getBean( Desktop.class);
//        dt1.compileMethod();
        Work work1=context.getBean(Work.class);
        System.out.println(work1.getAge());
        work1.code();



    }
    }
