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


