package com.supremesir.thread;

/**
 * @author HaoFan Fang
 * @date 2019/12/12 17:08
 */

public class JobTest {
    public static void main(String[] args) {
        //new Job类，无参构造
        Job job = new Job();
        //启动无参构造里创建的线程
        job.boss.start();
        job.wang.start();
        job.zhang.start();
    }
}
