package javaSE.CommonClass;

/**
 * 自动装箱 拆箱
 */
public class TestAutoPacking {

    public static void main(String[] args) {

        //自动装箱
        Integer i = 100;  //相当于编译器自动调用：
        //Integer i = Integer.valueOf(100);

        //自动拆箱
        int j = i;  //相当于编译器自动调用:
        //int j = i.intValue();

        Integer k = null;

        if (k != null) {
            int m = k;  //自动拆箱  调用了c.intValue()
        }


        Integer a = Integer.valueOf(-128);
        Integer b = -128;
        /**
         * true 因为缓存范围是[-128,127] （实际上是系统初始化的时候，创建了一个Integer类型的数组）
         * 当我们调用valueOf（）时，首先检查是否在[-128,127]之间，如果在这个范围内则直接从换缓存数组中拿出已经建好的对象
         * 如果不在，则创建新的Integer对象
         */
        System.out.println(a == b);  //true
        System.out.println(a.equals(b));

        Integer c = Integer.valueOf(-1289);
        Integer d = -1289;
        System.out.println(c == d);  //false 不在缓存范围内  new一个新对象
        System.out.println(c.equals(d));



    }


}
