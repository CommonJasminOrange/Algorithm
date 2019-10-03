package javaSE.OOP2;

public class TestInterface2 {
}

interface A{
    void testA();
}

interface B{
    void testB();
}

//接口可以多继承，接口C继承接口A和B
interface C extends A,B{
    void testC();
}
class MyTest implements C{

    @Override
    public void testA() {

    }

    @Override
    public void testB() {

    }

    @Override
    public void testC() {

    }
}