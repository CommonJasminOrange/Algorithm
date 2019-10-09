package javaSE.IO.dir;

import java.io.File;
import java.io.IOException;

public class DirDemo01 {
    public static void main(String[] args) throws IOException {

/**
 * mkdir() 确保上级目录存在
 * mkdirs() 上级目录一同创建
 * list() 列出下一级 名称
 * listFiles() 列出下级File对象
 * listRoots() 列出所有盘符
 */

    File dir = new File("G:/Algorithm/src/javaSE");
        //创建目录
//        boolean flag = dir.mkdirs();
//        System.out.println(flag);

        //列出下级名称 list
        String[] subNames = dir.list();
        for (String temp:subNames){
            System.out.println(temp);
        }

        System.out.println("-----------------------------");

        //列出下级对象 listFiles
        File[] subFiles = dir.listFiles();
        for (File temp:subFiles){
            System.out.println(temp);
        }

        System.out.println("-----------------------------");

        //列出所有盘符 listRoots
        File[] roots = dir.listRoots();
        for (File temp:roots){
            System.out.println(temp);
        }

    }
}
