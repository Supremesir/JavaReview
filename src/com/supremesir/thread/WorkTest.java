package com.supremesir.thread;

/**
 * @author HaoFan Fang
 * @date 2019/12/12 19:40
 */

public class WorkTest {
    public static void main(String[] args) {

        //new Work类，无参构造
        Work work = new Work();
        //启动无参构造里创建的线程
        work.read.start();
        work.write.start();

    }
}
