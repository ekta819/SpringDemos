package com.learn.spring;

import org.apache.catalina.Context;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;

public class Main {
    public static void main(String[] args) throws LifecycleException {

        System.out.println("Hello world!");

        Tomcat tomcat=new Tomcat();
        tomcat.setPort(8080);


        Context context=tomcat.addContext("", null);
        Tomcat.addServlet(context,"HelloServlet",new HelloServlet());
        context.addServletMappingDecoded("/hello", "HelloServlet");

        tomcat.start();
        tomcat.getServer().await();
    }
}