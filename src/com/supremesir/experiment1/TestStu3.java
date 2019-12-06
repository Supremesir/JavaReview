package com.supremesir.experiment1;

import java.util.Scanner;

/**
 * @author HaoFan Fang
 * @date 2019/12/6 14:42
 */

/**
 * 向上转型：是指将基类（也叫父类）引用转换为导出类（也叫子类）引用的动作
 *
 * 向下转型：这个就和向上转型相对应，但是有一点，向下转型必须是在已经向上转型的基础上进行
 */

public class TestStu3 {

    public static void main(String[] args) {

        final int NUM = 2;
        Student3[] stu3 = new Student3[NUM];
        //向上转型：将父类引用转换为子类引用
        stu3[0] =  new UnderGraStu3();
        stu3[1] = new GraStu3();

        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入学生姓名：");

        stu3[0].setName(scanner.next());
        //上转型的对象会丢失子类独有的方法
        //stu3[0].setGpa(scanner.nextInt());
        stu3[0].printInfo();
        //此时上转型对象调用的方法是子类覆盖或继承父类的方法，不是父类的方法
        stu3[0].study();


        System.out.println("请输入学生姓名：");
        stu3[1].setName(scanner.next());
        //stu3[1].setTutor(scanner.next());
        stu3[1].printInfo();
        stu3[1].study();

    }
}
