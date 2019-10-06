package javaSE.OO2;

/**
 * 执行顺序为：父类静态代码块 --> 子类静态代码块 --> 父类无参构造方法 --> 子类无参构造方法
 * 且静态代码块在初始化时仅执行一次
 */
class A {
    static {
        System.out.print("A");
    }
    public A() {
        System.out.print("a");
    }
}
class B extends A {
    static {
        System.out.print("B");
    }
    public B() {
        System.out.print("b");
    }
}
public class Hello {
    public static void main(String[] args) {
        A ab = new B();
        ab = new B();
    }
}