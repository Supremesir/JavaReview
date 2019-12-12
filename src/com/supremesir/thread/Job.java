package com.supremesir.thread;

/**
 * @author HaoFan Fang
 * @date 2019/12/12 17:07
 */

public class Job implements Runnable {

    Thread wang,zhang,boss;
    boolean a = false;
    boolean b = false;

    Job() {
        boss = new Thread(this);
        boss.setName("老板");
        wang = new Thread(this);
        wang.setName("王工");
        zhang = new Thread(this);
        zhang.setName("张工");
    }

    @Override
    public void run() {
        Thread thread = Thread.currentThread();
        if (thread == zhang) {
            for(int i=1;i<=3;i++)
            {
                System.out.println(Thread.currentThread().getName()+"已搬运了"+i+"箱苹果");
                try
                {
                    Thread.sleep(10000);
                    a=true;
                } catch (InterruptedException e)
                {
                    if(i!=3)
                    {
                        System.out.println("老板让张工继续工作");
                    }
                }
            }
            return;
        } else if (thread == wang) {
            for(int i=1;i<=3;i++)
            {
                System.out.println(Thread.currentThread().getName()+"已搬运了"+i+"箱香蕉");
                try
                {
                    Thread.sleep(10000);
                    b=true;
                } catch (InterruptedException e)
                {
                    if(i!=3)
                    {
                        System.out.println("老板让王工继续工作");
                    }
                }

            }
            return;
        } else if (thread == boss) {
            while(true)
            {
                if(zhang.isAlive()||wang.isAlive())
                {
                    zhang.interrupt();
                    wang.interrupt();
                }
                else break;
            }
            System.out.println("老板说：可以下班了");
        }

    }
}
