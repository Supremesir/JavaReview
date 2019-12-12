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
    boolean flag = false;

    Work() {
        read = new Thread(this);
        read.setName("ReadName");
        write = new Thread(this);
        write.setName("WriteName");
        this.ID = ID;
        this.Name = Name;
    }

    @Override
    public void run() {
        ReadWrite();
    }

    public synchronized void ReadWrite() {
        if (Thread.currentThread() == read) {
            while (true) {
                if (flag) {
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("请输入学号：");
                ID = scanner.next();
                if (ID.equals("finish")) {
                    System.out.println("请输入");
                    notify();
                    flag = true;
                    return;
                }
                System.out.println("请输入姓名：");
                Name = scanner.next();
                flag = true;
                notify();
            }


        }
        if (Thread.currentThread() == write) {
            while (true) {
                if (!flag) {
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("学号：" + ID + "\t姓名：" + Name);
                flag = false;
                notify();
            }
        }
    }
}
