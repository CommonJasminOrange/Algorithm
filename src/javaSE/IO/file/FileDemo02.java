package javaSE.IO.file;

import java.io.File;

public class FileDemo02 {
    public static void main(String[] args) {
        /**
         * 构建File对象
         * 相对路径与绝对路径
         * 1）存在盘符 绝对路径
         * 2）不存在盘符 相对路径
         */
        String path = "G:/Algorithm/src/javaSE/IO/7111.png";
        //绝对路径
        File src = new File(path);
        System.out.println(src.getAbsolutePath());
        //相对路径
        System.out.println(System.getProperty("user.dir"));
        src = new File("7111.png");
        System.out.println(src.getAbsolutePath());
    }
}
