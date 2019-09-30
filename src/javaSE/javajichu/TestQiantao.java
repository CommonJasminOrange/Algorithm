package javaSE.javajichu;
//嵌套
public class TestQiantao {

    public static void main(String[] args) {
// 99乘法表
//        for(int m = 1; m <= 9; m++){
//            for (int n = 1; n <= m; n++){
//                System.out.print(n+"*"+m+"="+m*n+" ");
//            }
//            System.out.println();
//            }
//        1-100奇数偶数和
//        int sum1 = 0;
//        int sum2 = 0;
//        for (int i = 1; i <= 100; i ++){
//            if (i % 2 == 0) sum1 += i;
//            else  sum2 +=i;
//        }
//        System.out.println("奇数和:"+sum2);
//        System.out.println("偶数和:"+sum1);
        //1-1000能被5整除的数 每行5个
        int count = 0;
        for (int i = 1; i <= 1000; i++){
            if (i % 5 == 0) {
                System.out.print(i+" ");
                count++;
            }
            if (count == 5) {
                System.out.println();
                count = 0;
            }

        }
    }

}
