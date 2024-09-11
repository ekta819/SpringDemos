package com.learn.spring;

public class Work {
    private int age;
   // private Laptop lap;
    private Computer comp;


  /*  public Work(){
        System.out.println("Work Obj created");
    }*/
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
      //  System.out.println("From setter of Work");
    }

   /* public Laptop getLap() {
        return lap;
    }

    public void setLap(Laptop lap) {
        this.lap = lap;
    }*/

    public Computer getComp() {
        return comp;
    }

    public void setComp(Computer comp) {
        this.comp = comp;
    }

    public void code()
    {
        System.out.println("Coding from Work class");
        //lap.lapMethod();
        comp.lapMethod();
    }
}
