package com.supremesir.experiment4;

/**
 * @author HaoFan Fang
 * @date 2019/12/12 16:13
 */

public class WriteName implements Runnable {

    RWinfo rw;
    WriteName(RWinfo w) {
        this.rw  = w;
    }

    //因为写线程是在读入数据之后join的，如果读到finish，程序直接结束，写线程不会运行
    @Override
    public void run() {
        System.out.println("学号：" + rw.ID+"" + "\t姓名:" + rw.Name);
    }
}
