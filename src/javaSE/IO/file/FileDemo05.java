package javaSE.IO.file;

import java.io.File;
import java.io.IOException;

public class FileDemo05 {
    public static void main(String[] args) throws IOException {
        /**
         * length() 文件的字节数
         * createNewFile() 创建文件 (不存在才创建) 只创建文件 没有后缀名还是文件
         * delete() 删除文件
         */
        String path = "G:/Algorithm/src/javaSE/IO/7111.png";
        File src = new File(path);
        System.out.println(src);

        src = new File("G:/Algorithm/a.txt");

        boolean flag = src.delete();
        System.out.println(flag);


        flag = src.createNewFile();
        System.out.println(flag);






    }
}
