package com.supremesir.thread;

/**
 * @author HaoFan Fang
 * @date 2019/12/12 19:40
 */

public class WorkTest {
    public static void main(String[] args) {

        Work work = new Work();
        work.read.start();
        work.write.start();

    }
}
