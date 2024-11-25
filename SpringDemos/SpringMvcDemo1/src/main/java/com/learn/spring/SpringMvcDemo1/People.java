package com.learn.spring.SpringMvcDemo1;

public class People {
    private int aid;
    private String aname;

    public int getAid() {
        return aid;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }

    public String getAname() {
        return aname;
    }

    public void setAname(String aname) {
        this.aname = aname;
    }

    @Override
    public String toString() {
        return "People{" +
                "aid=" + aid +
                ", aname='" + aname + '\'' +
                '}';
    }
}
