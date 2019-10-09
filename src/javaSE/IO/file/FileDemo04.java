package javaSE.IO.file;

import java.io.File;

public class FileDemo04 {
    public static void main(String[] args) {
        /**
         * 构建File对象
         * 相对路径与绝对路径
         * 1）存在盘符 绝对路径
         * 2）不存在盘符 相对路径
         */
        String path = "G:/Algorithm/src/javaSE/IO/7111.png";
        File src = new File(path);
        System.out.println("是否存在"+src.exists());
        System.out.println("是否是目录"+src.isDirectory());
        System.out.println("是否是文件"+src.isFile());

        System.out.println("---------------------");

        src = new File("G:/Algorithm");
        System.out.println("是否存在"+src.exists());
        System.out.println("是否是目录"+src.isDirectory());
        System.out.println("是否是文件"+src.isFile());

        System.out.println("----------------------");
        //文件状态
        src = new File("G:/Algorithm/src");
        if (src == null || !src.exists()){
            System.out.println("文件不存在");
        } else {
            if (src.isFile()){
                System.out.println("文件操作");
            } else {
                System.out.println("文件夹操作");
            }
        }
    }
}
