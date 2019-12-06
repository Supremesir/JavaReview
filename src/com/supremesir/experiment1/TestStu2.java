package com.supremesir.experiment1;

import java.util.Scanner;

/**
 * @author HaoFan Fang
 * @date 2019/12/6 13:59
 */

public class TestStu2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //抽象类不可以被实例化
        //Student2 student2 = new Student2();
        System.out.println("请输入学生姓名和GPA：");
        UnderGraStu2 under2 = new UnderGraStu2();
        under2.setName(scanner.next());
        under2.setGpa(scanner.nextInt());
        under2.printInfo();
        under2.study();
        System.out.println("请输入学生姓名和导师：");
        GraStu2 gra2 = new GraStu2();
        gra2.setName(scanner.next());
        gra2.setTutor(scanner.next());
        gra2.printInfo();
        gra2.study();
    }
}
