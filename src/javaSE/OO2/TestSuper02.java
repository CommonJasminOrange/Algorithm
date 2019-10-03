package javaSE.OO2;

public class TestSuper02 {
    public static void main(String[] args) {
        System.out.println("开始创建一个ChildClass对象...");
        new ChildClass2();
    }
}
class FatherClass2{
    public FatherClass2(){
        System.out.println("创建FatherClass2");
    }
}
class ChildClass2 extends FatherClass2{
    public ChildClass2(){
       // super(); //构造方法的第一句 调用父类构造器 默认super();  child -> father -> object
        System.out.println("创建ChildClass2");
    }
}