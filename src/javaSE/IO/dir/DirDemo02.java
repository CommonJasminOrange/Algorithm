package javaSE.IO.dir;

import java.io.IOException;

/**
 * 递归
 * //递归头 何时结束递归
 *  递归体 重复调用
 */

public class DirDemo02 {
    public static void main(String[] args) throws IOException {
        printTen(1);
    }
    //打印1-10的数
    public static void printTen(int n){

        if (n > 10){ //递归头 结束递归
            return;
        }
        System.out.println(n);
        printTen(n+1); //递归体 自己调用自己
    }
}
