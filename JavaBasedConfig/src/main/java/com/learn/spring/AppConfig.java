package com.learn.spring;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("com.learn.spring")
public class AppConfig {

    /*
   // @Bean(name = {"desk1","desktop1","dst1"})  -- to define Name of Bean
    @Bean
    @Primary
   // @Scope("prototype")
    public Desktop desktop(){
      return new Desktop();
    }

    @Bean
    public Laptop laptop(){
        return new Laptop();
    }

    @Bean
    public Work work(/*@Qualifier("laptop")*//* Computer comp){
        Work wrk=new Work();
        wrk.setAge(25);
        wrk.setComp(comp);
        return wrk;
    }*/


}
