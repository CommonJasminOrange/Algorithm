package javaSE.arrays;

import java.util.Arrays;

public class Test01 {
    public static void main(String[] args) {
        int[] arr01 = new int[10];
        String[] arr02 = new String[5];


        arr01[0] = 13;
        arr01[1] = 15;
        arr01[2] = 20;

        //通过循环初始化数组
        for (int i = 0; i < 10; i++){
            arr01[i] = 10 * i;
        }
        //通过循环读取数组里面元素的值
        for (int i = 0; i < 10; i++){
            System.out.println(arr01[i]);
        }

        User[] arr03 = new User[3];
        arr03[0] = new User(1001,"欢欢");
        arr03[1] = new User(1002,"小二");
        arr03[2] = new User(1003,"小三");

        for (int i = 0; i < 3; i ++){
            System.out.println(arr03[i].getName()+arr03[i].getId());
        }
    }
}

class User{
    private int id;
    private String name;

    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}