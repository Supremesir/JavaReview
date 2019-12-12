package com.supremesir.callback;

/**
 * @author HaoFan Fang
 * @date 2019/12/12 21:49
 */

/**
 * 回调接口的实现类
 */

public class Boss implements CallBack {
    @Override
    public void event() {
        System.out.println("打电话给老板，工作已经完成了");

    }
}
