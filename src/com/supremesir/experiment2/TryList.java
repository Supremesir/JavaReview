package com.supremesir.experiment2;

import java.util.*;

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

        //旧写法，匿名类Comparator重写compare方法
//        Collections.sort(stuList, new Comparator<Student4>() {
//            @Override
//            public int compare(Student4 o1, Student4 o2) {
//                return o1.name.compareTo(o2.name);
//            }
//        });
        //新写法，lambda比较器
        //根据姓名排序
        //FIXME: lambda比较器不能按照中文姓名排序
        Collections.sort(stuList,((o1, o2) -> o1.name.compareTo(o2.name)));
        System.out.println("按学生姓名排序：");
        //为stuList设置迭代器
        Iterator<Student4> iterator = stuList.iterator();
        while (iterator.hasNext()) {
            //返回下一个对象
            Student4 student4 = iterator.next();
            System.out.println("学生姓名：" + student4.name + "\n学生计算机成绩：" + student4.computerScore);
        }


        //根据计算机成绩排序
        Collections.sort(stuList,((o1, o2) -> o1.computerScore-o2.computerScore));
        System.out.println("\n按学生计算机成绩排序：");
        //为stuList设置迭代器
        Iterator<Student4> iterator1 = stuList.iterator();
        while (iterator1.hasNext()) {
            //返回下一个对象
            Student4 student4 = iterator1.next();
            System.out.println("学生姓名：" + student4.name + "\n学生计算机成绩：" + student4.computerScore);
        }

    }
}
