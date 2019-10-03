package javaSE.OO2;

import java.util.Objects;
/**
 == 代表比较双方是否相同 基本类型 值相等 引用类型 地址相等  即表示是同一个对象
Object类中定义有: public boolean equals(Object obj)方法,提供定义"对象内容相等”的逻辑。
 比如，我们在公安系统中认为id相同的人就是同一个人、学籍系统中认为学号相同的人就是同一个人。
Object的equals方法默认就是比较两个对象的hashcode ,
 是同一个对象的引用时返回true否则返回false。但是,我们可以根据我们自己的要求重写equals方法。
 **/

public class TestEquals {

    public static void main(String[] args) {

        Object obj;
        String str;


        User u1 = new User(1000,"aa","123456");
        User u2 = new User(1000,"aa","123456");

        System.out.println(u1 == u2);
        System.out.println(u1.equals(u2));

        String str1 = new String("sss");
        String str2 = new String("sss");
        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));
    }



}

class User{
    int id;
    String name;
    String pwd;

    public User(int id, String name, String pwd) {
        this.id = id;
        this.name = name;
        this.pwd = pwd;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        User user = (User) o;
        return id == user.id &&
                Objects.equals(name, user.name) &&
                Objects.equals(pwd, user.pwd);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, pwd);
    }
}