package com.learn.spring.demo1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Demo1Application {

	public static void main(String[] args) {

		ApplicationContext context= SpringApplication.run(Demo1Application.class, args);
		Work obj1 =context.getBean(Work.class);
		obj1.code();
	/*	Work obj2 =context.getBean(Work.class);
		obj2.code();
		System.out.println(obj1==obj2); //true meaning both referring to same object.
		*/
	}

}
