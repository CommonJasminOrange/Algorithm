package javaSE.arrays;

/**
 * 测试数组的三种初始化方式
 *
 */
public class Test02 {

    public static void main(String[] args) {



        //静态初始化
        String[] a = {"2","3","4"};
        User[] b = {
                new User(1001,"小三"),
                new User(1002,"小四"),
                new User(1003,"小五")
        };

        //默认初始化
        int[] c = new int[3]; //默认给数组元素进行赋值，赋值规则和成员变量默认赋值规则一致

        //动态初始化
        int[] d = new int[2];
        d[0] = 1;
        d[1] = 2;
        //foreach循环时读取数组或者集合的元素 不能用来修改元素
        for (int i: d){
            System.out.println(i);
        }
        for (String j: a){
            System.out.println(j);

        }
    }



}
