package com.supremesir.experiment1;

/**
 * @author HaoFan Fang
 * @date 2019/12/6 15:25
 */
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
