package javaSE.javajichu;
//测试递归
public class TestRecursion01 {
    public static void main(String[] args) {
        long d1 = System.currentTimeMillis();
        System.out.printf("%d阶乘的结果：%s%n",10,a(10));
        long d2 = System.currentTimeMillis();
        System.out.printf("递归耗时：%s%n",d2 -d1);
        b(10);
    }
    //非递归
    public static long b(int a){
        long d3 = System.currentTimeMillis();
        long result = 1;
        while (a > 1){
            result *= a * (a - 1);
            a -= 2;
        }
        long d4 = System.currentTimeMillis();
        System.out.printf("普通循环费时：%s%n",d4-d3);
        return result;
    }

    static long a(long n){

        if (n == 1)
        return 1;
        else return n * a(n-1);
    }
    static void b(){
        System.out.println("b");
    }
}
