package com.supremesir.test2;

import java.util.Scanner;

/**
 * @author HaoFan Fang
 * @date 2019/12/6 10:59
 */

public class TestArrayOpt {
    //记得在测试类里写主方法main方法
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个数组：");
        //通过字符串读取一行数字
        String s = scanner.nextLine();
        //将其按照空格分割成字符串数组
        String[] s1 = s.split(" ");
        //new一个int数组，长度要取为分割好后的字符串数组的长度
        int[] array = new int[s1.length];
        //依次将string转为int存入int数组中
        for (int i = 0; i < s1.length; i++) {
            array[i] = Integer.parseInt(s1[i]);
        }
        ArrayOpt arrayOpt = new ArrayOpt(array);
        System.out.println("最小的数字是：" + arrayOpt.getMin_number() + "\n最小数字的位置是:" + arrayOpt.getMin_location()+"\n平均数是："+arrayOpt.getAverage());
    }
}
