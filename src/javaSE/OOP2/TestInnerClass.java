package javaSE.OOP2;

/**
 * 测试非静态内部类
 * 1.类文件 外部类@内部类.class   Outer@Inner.class
 * 2.非静态内部类必须寄存在一个外部类对象里。
 * 3.非静态内部类可以直接访问外部类的成员，但外部类不可以直接访问非静态内部类的成员
 * 4.非静态内部类不能有静态方法、静态属性和静态初始化块。
 * 5.外部类的静态方法、静态代码块不能访问非静态内部类,包括不能使用非静态内部类定义变量、创建实例。
 */
public class TestInnerClass {

    public static void main(String[] args) {
        //创建内部类对象
        Outer.Inner inner = new Outer().new Inner();
        inner.show();
    }
}

class Outer{
    private int age = 10;

    public void testOuter(){
        System.out.println("Outer.testOuter()");
    }

    class Inner{
        int age = 20;
        public void show(){
            int age = 30;
            System.out.println("外部类的成员变量age:"+Outer.this.age);
            System.out.println("内部类的成员变量age:"+this.age);
            System.out.println("局部变量age:"+age);
        }
    }
}