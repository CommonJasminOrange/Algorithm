package javaSE.OOP2;

/**
 * 1.由抽象方法的类只能定义成抽象类
 * 2.抽象类不能实例化
 *抽象方法, 1.没有实现 2.子类必须实现
 */
abstract public class Animal {
   abstract public void shout();

   public void run(){
       System.out.println("run");
   }

}
class Dog extends Animal{

    @Override
    public void shout() {
        System.out.println("汪汪汪");
    }
}
