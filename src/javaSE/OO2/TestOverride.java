package javaSE.OO2;

public class TestOverride {
    public static void main(String[] args) {
        Horse horse = new Horse();
        horse.run();
    }

}

class Vehicle{
    public void run(){
        System.out.println("跑...");
    }

    public void stop(){
        System.out.println("停...");
    }

    public Person whoIsPsg(){
        return new Person();
    }
}

class Horse extends Vehicle{

/*重写基本要点
* 1.== 方法名 形参列表相同
* 2.<= 返回值类型，声明异常类型小于等于父类
* 3.>= 访问权限，子类大于等于父类
* */

    public void run(){
        System.out.println("驾...");
    }
    public Student whoIsPsg(){  //返回值类型小于等于父类的返回值类型
        return new Student();
    }
}