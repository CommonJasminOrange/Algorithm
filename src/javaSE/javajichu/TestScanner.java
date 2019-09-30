package javaSE.javajichu;
//键盘输入
import java.util.Scanner;
public class TestScanner {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入名字:");
        String name = scanner.nextLine();
        System.out.println("请输入爱好:");
        String favor = scanner.nextLine();
        System.out.println("请输入年龄：");
        int age = scanner.nextInt();

        System.out.println("###################");
        System.out.println(name);
        System.out.println(favor);
        System.out.println((72-age)*365);
    }
}
