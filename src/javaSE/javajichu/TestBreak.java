package javaSE.javajichu;
//break语句
public class TestBreak {
    public static void main(String[] args) {
        int total = 0;
        System.out.println("Begin");
        while (true){
            total ++;
            int i = (int) (Math.random()*100);
            System.out.println(i);
            if (i == 88){
                break;
            }
        }
        //输出循环次数
        System.out.println("Game Over,used "+total+" times");
    }
}
