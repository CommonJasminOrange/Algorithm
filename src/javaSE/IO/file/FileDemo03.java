package javaSE.IO.file;

import java.io.File;

public class FileDemo03 {
    public static void main(String[] args) {
        /**
         * 构建File对象
         * 相对路径与绝对路径
         * 1）存在盘符 绝对路径
         * 2）不存在盘符 相对路径
         */
        String path = "G:/Algorithm/src/javaSE/IO/7111.png";
        File src = new File("7111.pmg");
        File src1 = new File("G:/Algorithm/src/javaSE/IO/7111.png");

        System.out.println(src.getPath());
        System.out.println(src1.getName());
        System.out.println(src.getAbsolutePath());
        System.out.println(src.getParent());

    }
}
