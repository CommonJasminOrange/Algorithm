package javaSE.IO.file;

import java.io.File;

public class FileDemo01 {
    public static void main(String[] args) {
        /**
         * 构建File对象
         *
         */
        String path = "G:/Algorithm/src/javaSE/IO/7111.png";

        //1.构建File对象
        File src = new File(path);
        System.out.println(src.length());

        //2.构建File对象
        src = new File("G:/Algorithm/src/javaSE/IO","7111.png");
        src = new File("G:/Algorithm/","src/javaSE/IO/7111.png");
        System.out.println(src.getName());
        //3.构建File对象
        src = new File(new File("G:/Algorithm/src/javaSE"),"IO/7111.png");
        System.out.println(src.length());
    }
}
