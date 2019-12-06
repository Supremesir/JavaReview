package com.supremesir.experiment1;

/**
 * @author HaoFan Fang
 * @date 2019/12/6 15:25
 */
class UnderGraStu3 extends Student3 {
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


    public void study() {
        System.out.println("本科生做实验");
    }

}
