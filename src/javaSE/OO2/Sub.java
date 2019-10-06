package javaSE.OO2;


class Supper{
    public int get(){
        System.out.println("Supper");
        return  5;
    }
}
public class Sub {
    public int get(){
        System.out.println("Sub");
        return new Integer("5");
    }

    public static void main(String[] args) {
        /**
         *newSupper().get()和newSub().get()只调用了get()方法，
         * 没有打印输出get()返回的数值，所以肯定没有5
         */
        //new Supper().get();
        //new Sub().get();
        System.out.println(new Supper().get());
        System.out.println(new Sub().get());

    }
}
