package javaSE.OO2;

//Object类是所有类的根基类，所以java对象都拥有Objec类的属性和方法
public class TestObject {
    public static void main(String[] args) {

        TestObject to = new TestObject();
        System.out.println(to.toString());

        Person2 p1 = new Person2("丹旎", 16);
        System.out.println(p1.toString());
    }
//重写toString方法
    public String toString(){
        return "测试Object对象";
    }
}

class  Person2{
    String name;
    int age;

    public String toString(){
        return name+",年龄："+age;
    }

    public Person2(String name, int age){
        this.name = name;
        this.age = age;
    }
}