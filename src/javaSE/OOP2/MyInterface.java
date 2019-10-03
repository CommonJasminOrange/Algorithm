package javaSE.OOP2;

/**
 *接口定义：
 * 1.访问修饰符只能是public或默认
 * 2.extends 接口可以多继承
 * 3.接口中的属性只能是常量 总是 public static final 修饰 ，不写也是
 * 4.接口中的方法只能是 public abstract ，不写也是
 *要点：
 * 1.子类通过implements来实现接口的规范
 * 2.接口不能创建实例，但是可用于声明引用变量类型
 * 3.一个类实现了接口，必须实现接口所有的方法，并且这些方法只能是publicde
 * 4.JDK7之前 接口中只能包含静态常量，抽象方法，不能用普通属性 ，构造方法，普通方法
 * 5.JDK8之后 接口中包含普通的静态方法
 */

public interface MyInterface {
    /*public static final*/ int MAX_AGE = 100;
   /*public abstract*/ void test01();
}

class MyClass implements MyInterface{

    @Override
    public void test01() {
        System.out.println(MAX_AGE);
        System.out.println("MyClass.test01()");
    }
}