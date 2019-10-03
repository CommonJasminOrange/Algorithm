package javaSE.OOP;
//构造方法重载
public class User {

    int id;
    int age;
    String name;
    public User(){

    }
    public User(int id, int age, String name){
        this.id = id;
        this.age = age;
        this.name = name;

    }
    public User(int id, int age){
    //    super(); //构造方法的第一句总是super()
        this.id = id;
        this.age =age;

    }

    public static void main(String[] args) {

        User u1 = new User();
        User u2 = new User(001,14);
        User u3 = new User(002,24,"zs");

    }
}
