package javaSE.javajichu;
//重载
public class TestOverload {
    public static void main(String[] args) {
        //print就是重载的方法
        System.out.println(add(1,2,3));
        System.out.println(add(1,2));
        System.out.println(add(1,2.0));
        System.out.println(add(1.0,2));
    }
    public static int add(int a, int b, int c){
        int sum = a + b + c;
        return sum;
    }
    //方法名相同，参数个数不同，构成重载
    public static int add(int a, int b){
        int sum = a + b;
        return sum;
    }
    //方法名相同，参数类型不同，构成重载
    public static double add(int a, double b){
        double sum = a + b;
        return sum;
    }
    //方法名相同，参数顺序不同，构成重载
    public static double add(double a, int b){
        double sum = a + b;
        return sum;
    }
//    //编译错误：只有返回值不同，不构成重载
//    public static double add(int a, int b){
//        double sum = a + b;
//        return sum;
//    }
//    //编译错误：只有参数名称不同，不构成重载
//    public static int add(int b, int a){
//        int sum = a + b;
//        return sum;
//    }
}
