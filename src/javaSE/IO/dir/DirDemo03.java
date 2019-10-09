package javaSE.IO.dir;

import java.io.File;
import java.io.IOException;

/**
 * 递归
 * //递归头 何时结束递归
 * 递归体 重复调用
 */

public class DirDemo03 {
    public static void main(String[] args) throws IOException {
        File src = new File("G:/Algorithm/src/javaSE");
        printName(src,0);
    }

    //打印子孙级目录和文件的名称
    public static void printName(File src,int deep) {
        for (int i = 0;i<deep;i++){
            System.out.print("-");
        }
        System.out.println(src.getName());
        if (src == null || !src.exists()) { //递归头 结束递归
            return;
        } else if (src.isDirectory()){ //目录
            for (File temp:src.listFiles()){
                printName(temp,deep+1); //递归体
            }
        }
    }
}