package com.supremesir.experiment2;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * @author HaoFan Fang
 * @date 2019/12/11 19:09
 */

public class TryList {
    public static void main(String[] args) {
        String name;
        int score;
        //新建一个链表，用来存放Student4的对象
        LinkedList<Student4> stuList = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("请输入学生的姓名和计算机成绩：");
            name = scanner.next();
            //String字符串比较不能用 X == Y
            if (name.equals("finish")) {
                break;
            }
            score = scanner.nextInt();
            //根据读取到的信息对Student实例化
            Student4 stu4 = new Student4(name, score);
            //将实例化的对象添加到链表
            stuList.add(stu4);
        }

        //为stuList设置迭代器
        Iterator<Student4> iterator = stuList.iterator();
        while (iterator.hasNext()) {
            //
            Student4 now = iterator.next();
            System.out.println("学生姓名：" + now.name + "\n学生计算机成绩：" + now.computerScore);
        }

    }
}
