package com.supremesir.experiment1;

/**
 * @author HaoFan Fang
 * @date 2019/12/6 15:25
 */
class UnderGraStu2 extends Student2 {
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

    //重写父类的抽象方法
    @Override
    public void study() {
        System.out.println("本科生做实验");
    }

}
