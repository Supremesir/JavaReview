package com.supremesir.experiment1;

/**
 * @author HaoFan Fang
 * @date 2019/12/6 13:54
 */

/**
 * 抽象类和抽象方法总结
 *
 * 1. 抽象类不能被实例化(初学者很容易犯的错)，如果被实例化，就会报错，编译无法通过。只有抽象类的非抽象子类可以创建对象。
 *
 * 2. 抽象类中不一定包含抽象方法，但是有抽象方法的类必定是抽象类。
 *
 * 3. 抽象类中的抽象方法只是声明，不包含方法体，就是不给出方法的具体实现也就是方法的具体功能。
 *
 * 4. 构造方法，类方法（用 static 修饰的方法）不能声明为抽象方法。
 *
 * 5. 抽象类的子类必须给出抽象类中的抽象方法的具体实现，除非该子类也是抽象类。
 */

//抽象类不可以被实例化，只能被继承使用
abstract class Student2 {

    protected String name;

    Student2() {
    }

    Student2(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printInfo() {
        System.out.println("name:" + name);
    }

    //抽象方法只包含一个方法名，而没有方法体
     public abstract void study();

    //如果一个类包含抽象方法，那么该类必须是抽象类。
    //任何子类必须重写父类的抽象方法，或者声明自身为抽象类。
}

