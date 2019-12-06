package com.supremesir.test1;

/**
 * @author HaoFan Fang
 * @date 2019/12/6 10:40
 */

public class NumCompute {
    private int  a,b;

    NumCompute(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int AddNum() {
        return a + b;
    }

    public double DivideNum() {
        return (double) a / b;
    }
}
