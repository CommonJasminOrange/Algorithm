package javaSE.exception;

public class Test01 {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        if (a != 0){
            System.out.println(b/a);
        }

        String str = null;
        if (str != null){
            str.length();
        }


        Animal d = new Dog();
        if (d instanceof Cat){
            Cat c = (Cat)d;
        }

        int[] arr = new int[5];
        int x = 5;
        if (x < arr.length){
            System.out.println(arr[x]);
        }


    }



}

class Animal{

}
class Dog extends Animal{

}
class Cat extends Animal{

}
