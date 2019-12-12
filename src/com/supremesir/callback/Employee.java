package com.supremesir.callback;

import static java.lang.Thread.sleep;

/**
 * @author HaoFan Fang
 * @date 2019/12/12 21:55
 */

/**
 * 控制类，持有Boss的地址（即回调接口）
 */

public class Employee implements CallBack {
    CallBack callback;

    Employee(CallBack callback) {
        this.callback = callback;
    }

    public void work() throws InterruptedException {
        System.out.println("玩命干活中....");
        Thread.sleep(5000);
        callback.event();
    }

    @Override
    public void event() {
        System.out.println("疯狂摸鱼中....");
    }
}
