package javaSE.OO2;
//测试继承
public class TestExtends {

    public static void main(String[] args) {
        Student stu = new Student();
        stu.name = "江欢欢";
        stu.height = 168;
        stu.rest();
        stu.study();

        Student stu2 = new Student("樊丹旎", 21, "金融");
        System.out.println(stu2 instanceof Student); //instanceof用来判断左边对象是不是右边类的对象
        System.out.println(stu2 instanceof Person);
    }

}

class Person{
    String name;
    int height;

    public void rest(){
        System.out.println("休息一会");
    }
}

class Student extends Person{

    String major;

    public void study(){
        System.out.println("学习两小时");
    }
    public Student(String name,int height,String major){
        this.name = name;
        this.height = height;
        this.major = major;
    }
    public Student(){

    }

}
