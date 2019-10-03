package javaSE.OOP2;

public class TestInterface {
    public static void main(String[] args) {

        Angel v = new Angel();
        v.fly();
        v.HelpOther();

        Honest h = new GoodMan();
        h.HelpOther();
       // h.fly();
    }
}

/**
 * 飞行接口
 */
interface Volant{
    int FLY_HEIGHT = 1000;
    void fly();

}
/**
 * 善良接口
 */

interface Honest{
    void HelpOther();
}

class Angel implements Volant,Honest{

    @Override
    public void fly() {
        System.out.println("Angel.fly()");
    }

    @Override
    public void HelpOther() {
        System.out.println("Angel.helpOther()");
    }
}

class GoodMan implements Honest{

    @Override
    public void HelpOther() {
        System.out.println("GoodMan.helpOther()");
    }
}

class BirdMan implements Volant{

    @Override
    public void fly(){
        System.out.println("BirdMan.fly()");
    }
}
