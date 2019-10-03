package javaSE.OOP;

import javaSE.OO2.Human;

public class TestEncapsulation2 {
    public static void main(String[] args) {

        Human h = new Human();
    //  h.age = 12;
    //  h.name = "欢欢"; //name为default属性，不能被不同包的类访问
        h.sayAge();
    }
}
