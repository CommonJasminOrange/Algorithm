package javaSE.javajichu;
//continue语句
public class testContinue {
    public static void main(String[] args) {
        int count = 0;
        for (int i =100; i < 150;i ++){
            //如果是3的倍数，则跳过本次循环，继续进行下次循环
            if (i % 3 == 0){
                continue;
            }
            System.out.print(i+" ");
            count++;
            if (count %5 == 0){
                System.out.println();

            }
        }
    }
}
