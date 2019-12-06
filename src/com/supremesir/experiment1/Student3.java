package com.supremesir.experiment1;

/**
 * @author HaoFan Fang
 * @date 2019/12/6 14:32
 */

class Student3 {
    protected String name;

    Student3() {
    }

    Student3(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printInfo() {
        System.out.println("name:" + name);
    }

    public void study() {
        System.out.println("学生学习");
    }

}

