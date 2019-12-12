package com.supremesir.thread;

/**
 * @author HaoFan Fang
 * @date 2019/12/12 17:08
 */

public class JobTest {
    public static void main(String[] args) {
        Job job = new Job();
        job.boss.start();
        job.wang.start();
        job.zhang.start();
    }
}
