package javaSE.OO2;

/**多态
 * 1.多态是方法的多态，不是属性的多态（多态与属性无关）
 * 2.三个必要条件：继承，方法重写，父类引用指向子类对象
 * 3.父类引用指向子类对象后，用该父类引用调用子类重写的方法，此时多态就出现了
 */

/**final关键字
 * 1.final修饰变量，则变量不能被改变（重新赋值）
 * 2.final修饰方法，则方法不能被子类重写 但可以重载
 * 3.final修饰类，则该类不嫩能被继承 比如Math , String
 */

public class TesrtPoly {
    public static void main(String[] args) {
        Animal a = new Animal();
        animalCry(a);
        Animal d = new Dog();  //自动向上转型
        Animal c = new Cat();
        animalCry(c);
        animalCry(d);

        //d2.seeDoor();  //类型为Animal 需强制转为 Dog
        Dog d2 = (Dog) d; //强制向下转型
        d2.seeDoor();

        Dog d3 = (Dog) c; //运行出错， 不能把Cat强转换为Dog c本质是Cat类型
        d3.seeDoor();
    }

    static void animalCry(Animal a){
        a.shout();
    }

}




class Animal{

    public void shout(){
        System.out.println("叫了一声");
    }
}
class Dog extends Animal{
    public void shout(){
        System.out.println("汪汪汪");
    }
    public void seeDoor(){
        System.out.println("看门！！！");
    }
}
class Cat extends Animal{
    public void shout(){
        System.out.println("喵喵喵");
    }
}
