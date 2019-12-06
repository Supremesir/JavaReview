package com.supremesir.test1;

import java.util.Scanner;

/**
 * @author HaoFan Fang
 * @date 2019/12/6 10:52
 */

public class TestNumCompute {
    public static void main(String[] args) {
        int a,b;
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入两个数：");
        a = scanner.nextInt();
        b = scanner.nextInt();
        NumCompute numCompute = new NumCompute(a,b);
        System.out.println("两数之和为："+numCompute.AddNum()+"\n两数之除为："+numCompute.DivideNum());
    }
}
