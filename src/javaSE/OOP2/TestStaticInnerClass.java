package javaSE.OOP2;

/**
 * 静态内部类
 * 1.当一个静态内部类对象存在,并不一定存在对应的外部类对象。因此,静态内部类的实例方法不能直接访问外部类的实例方法。
 * 2.静态内部类看做外部类的一个静态成员。因此,外部类的方法中可以通过: "静态内部类.名字”的方式访问静态内部类的静态成员,通过new静态内部类(访问静态内部类的实例
 *
 */
public class TestStaticInnerClass {
    public static void main(String[] args) {
        Outer2.Inner2 inner = new Outer2.Inner2();

    }
}

class Outer2{

    static class Inner2{

    }
}
