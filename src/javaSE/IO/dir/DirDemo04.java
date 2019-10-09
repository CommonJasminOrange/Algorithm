package javaSE.IO.dir;

import java.io.File;
import java.io.IOException;

/**
 *
 * 统计文件夹大小
 *
 */

public class DirDemo04 {
    public static void main(String[] args) throws IOException {
        File src = new File("G:/Algorithm/src/javaSE");
        count(src);
        System.out.println(len);
    }
    private static long len = 0;

    public static void count(File src) {
        //获取大小
        if (src != null && src.exists()){
            if (src.isFile()){  //大小
                len += src.length();
            } else { //子孙级
                for (File temp:src.listFiles()){
                    count(temp);
                }
            }
        }
    }
}