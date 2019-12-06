package com.supremesir.experiment1;

import java.util.Scanner;

/**
 * @author HaoFan Fang
 * @date 2019/12/6 13:35
 */

public class TestStu1 {

    public static void main(String[] args) {
        String name, tutor;
        int gpa;
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入学生姓名：");
        name = scanner.next();
        Student1 stu1 = new Student1(name);
        stu1.printInfo();
        System.out.println("请输入学生姓名和GPA：");
        UnderGraStu1 under1 = new UnderGraStu1();
        under1.setName(scanner.next());
        under1.setGpa(scanner.nextInt());
        under1.printInfo();
        System.out.println("请输入学生姓名和导师：");
        GraStu1 gra1 = new GraStu1();
        gra1.setName(scanner.next());
        gra1.setTutor(scanner.next());
        gra1.printInfo();

    }
}
