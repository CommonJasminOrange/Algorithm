package javaSE.OOP2;

public class TestAnoymousInnerClass {

    public static void test01(AA a){
        System.out.println("########");
        a.aa();
    }

    public static void main(String[] args) {
        TestAnoymousInnerClass.test01(new AA(){

            @Override
            public void aa() {
                System.out.println("TestAnoymousInnerClass.test01");
            }
        });
    }
}
interface AA{
    void aa();
}
