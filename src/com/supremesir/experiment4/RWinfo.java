package com.supremesir.experiment4;

/**
 * @author HaoFan Fang
 * @date 2019/12/12 16:11
 */

public class RWinfo {
    protected String ID;
    protected String Name;

    public static void main(String[] args) {
        RWinfo info = new RWinfo();
        ReadName readName = new ReadName(info);
        Thread thread = new Thread(readName);
        thread.start();
    }
}
