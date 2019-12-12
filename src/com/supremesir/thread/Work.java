package com.supremesir.thread;

import java.io.IOException;
import java.util.Scanner;
import java.util.concurrent.locks.ReadWriteLock;

/**
 * @author HaoFan Fang
 * @date 2019/12/12 19:35
 */


public class Work implements Runnable {
    Scanner scanner = new Scanner(System.in);
    Thread read, write;
    String ID,Name;
    //是否已经读入数据的标志
    boolean flag = false;

    Work() {
        //创建线程
        read = new Thread(this);
        //给线程命名
        read.setName("ReadName");
        write = new Thread(this);
        write.setName("WriteName");
    }

    //Runnable接口要实现的方法
    @Override
    public void run() {
        ReadWrite();
    }

    /**
     * 是某个对象实例内，synchronized aMethod(){}可以防止多个线程同时访问这个对象的synchronized方法（如果一个对象有多个synchronized方法，只要一个线程访问了其中的一个synchronized方法，其它线程不能同时访问这个对象中任何一个synchronized方法）。这时，不同的对象实例的synchronized方法是不相干扰的。也就是说，其它线程照样可以同时访问相同类的另一个对象实例中的synchronized方法；
     * 是某个类的范围，synchronized static aStaticMethod{}防止多个线程同时访问这个类中的synchronized static 方法。它可以对类的所有对象实例起作用。
     */

    //防止多个线程同时访问该方法
    public synchronized void ReadWrite() {
        //如果运行的是读线程
        if (Thread.currentThread() == read) {
            while (true) {
                //如果已经读入数据
                if (flag) {
                    try {
                        //强迫读线程等待
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("请输入学号：");
                ID = scanner.next();
                if (ID.equals("finish")) {
                    System.out.println("请输入");
                    //标志已经读入数据
                    flag = true;
                    //finish之后，通知写线程运行
                    notify();
                    return;
                }
                System.out.println("请输入姓名：");
                Name = scanner.next();
                //标志已经读入数据
                flag = true;
                //正常读取结束后，通知写线程进行
                notify();
            }

        }
        //如果运行的是写线程
        if (Thread.currentThread() == write) {
            while (true) {
                //如果没有读入数据
                if (!flag) {
                    try {
                        //强迫写线程等待
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                if (ID.equals("finish")) {
                    return;
                }
                System.out.println("学号：" + ID + "\t姓名：" + Name);
                //输出结束后标志为未读入数据
                flag = false;
                //通知读线程进行
                notify();
            }
        }
    }
}
