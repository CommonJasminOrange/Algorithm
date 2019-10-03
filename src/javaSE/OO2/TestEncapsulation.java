package javaSE.OO2;

public class TestEncapsulation {
    public static void main(String[] args) {

        Human h = new Human();
    //    h.age = 13;
        h.name = "欢欢";
        h.height = 230;

        Person4 p4 = new Person4();
        //p4.age = 14;
        p4.setAge(22);
        p4.setName("丹旎");
        System.out.println(p4.getName());
        System.out.println(p4.getAge());


    }
}

class Boy extends Human{
    void sayHello(){
   //     System.out.println(age);  //子类无法使用父类的私有属性和方法
    }
}

class Girl extends Human{
    void sayGood(){
        System.out.println(height);
    }
}