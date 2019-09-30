package javaSE.OOP;

public class Student {

    int id;
    String name;
    int age;

    Computer computer;

    void study(){
        System.out.println("我在使用电脑："+computer.brand);
    }

    void play(){
        System.out.println("我在王者农药！！");
    }

    public static void main(String[] args) {

        Student student = new Student(); //创建一个对象 调用了Student构造方法
        System.out.println(student);
        student.id = 1001;
        student.name = "王智贤";
        student.age = 21;

        Computer c1 = new Computer();
        c1.brand = "Apple";

        student.computer = c1;

        student.play();
        student.study();

    }

static class Computer{

        String brand;
}


}
