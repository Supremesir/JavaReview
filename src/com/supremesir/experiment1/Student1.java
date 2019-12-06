package com.supremesir.experiment1;


/**
 * @author HaoFan Fang
 * @date 2019/12/6 13:15
 */

class Student1 {
    //父类属性用protected
    protected String name;
    //无参构造方法
    Student1() {
    }
    //有参构造方法
    Student1(String name) {
        this.name = name;
    }

    //getter,setter,print等外界访问类内属性的方法均为public
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printInfo() {
        System.out.println("name:" + name);
    }
}

class UnderGraStu1 extends Student1 {
    //子类属性用private
    private int gpa;

    public int getGpa() {
        return gpa;
    }

    public void setGpa(int gpa) {
        this.gpa = gpa;
    }

    public void printInfo() {
        System.out.println("name:" + name + ",gpa:" + gpa);
    }
}

class GraStu1 extends Student1 {
    private String tutor;

    public String getTutor() {
        return tutor;
    }

    public void setTutor(String tutor) {
        this.tutor = tutor;
    }

    public void printInfo() {
        System.out.println("name:" + name + ",tutor:" + tutor);
    }
}


