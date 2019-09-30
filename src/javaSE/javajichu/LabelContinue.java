package javaSE.javajichu;
//带标签的break，continue语句
public class LabelContinue {
    public static void main(String[] args) {
        //内循环跳出至外循环时 使用带标签的break,continu语句
       outer: for (int i = 101; i <= 150; i ++){
            for (int j = 2;j < i >> 1; j ++){
                if (i % j == 0){
                    continue outer;
                }
            }
            System.out.print(i + " ");
        }
    }
}
