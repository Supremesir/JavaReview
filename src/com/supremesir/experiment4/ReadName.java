package com.supremesir.experiment4;

import java.util.Scanner;

/**
 * @author HaoFan Fang
 * @date 2019/12/12 16:12
 */

public class ReadName implements Runnable {

    RWinfo rw;
    ReadName(RWinfo r) {
        this.rw = r;
    }

    @Override
    public void run() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("请输入学号：");
            rw.ID = scanner.next();
            if (rw.ID.equals("finish")) {
                System.out.println("读线程结束");
                scanner.close();
                break;
            }
            System.out.println("请输入姓名：");
            rw.Name = scanner.next();
            //线程联合（将写线程强制加入读线程，读入姓名和ID结束后，加入写线程，写完后继续执行读线程）
            Thread writeThread = new Thread(new WriteName(rw));
            writeThread.start();
            try {
                writeThread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

    }
}
