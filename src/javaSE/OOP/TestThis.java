package javaSE.OOP;

public class TestThis {
    int a;
    int b;
    int c;
//所有静态变量，方法 属于类信息，非静态 属于方法  不能调用
    TestThis(int a, int b){
        this.a = a; //this不能用于static方法中
        this.b = b;

    }
    TestThis(int a, int b, int c){
        this(a, b);//调用构造器 必须为第一句
        this.c = c;
    }
    void sing(){
        System.out.println("我在唱《七里香》!");
    }
    void eat(){
        this.eat();
        System.out.println("你妈喊你回家吃饭!");
    }

    public static void main(String[] args) {
        TestThis th = new TestThis(2,3);
        th.eat();
    }
}
