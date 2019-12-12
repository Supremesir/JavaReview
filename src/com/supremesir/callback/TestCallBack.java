package com.supremesir.callback;

/**
 * @author HaoFan Fang
 * @date 2019/12/12 21:58
 */

/**
 * 在C/C++中，要实现回调函数，被调用函数要告诉调用者自己的指针地址。但是Java没有指针地址，不能传递方法的地址，一般采用接口回调的方法来实现：把实现某一接口的类创建的对象的引用赋给该接口声明的接口变量，那么该接口变量就可以调用被调用类实现的接口的方法。
 *
 * 原理：首先创建一个回调对象，然后再创建一个控制器对象，将回调对象需要被调用的方法告诉控制器对象，控制器对象负责检查某个场景是否出现或某个条件是否满足，当满足时，自动调用回调对象的方法。
 */
public class TestCallBack {
    public static void main(String[] args) throws InterruptedException {

        //把实现CallBack接口的Boss类的对象的引用，赋给Employee的有参构造里的接口变量
        Employee employee = new Employee(new Boss());
        //调用自己的接口
        employee.event();
        //work函数里接口回调
        employee.work();
    }

}
