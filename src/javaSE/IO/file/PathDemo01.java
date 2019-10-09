package javaSE.IO.file;

import java.io.File;

/**
 *
 */
public class PathDemo01 {
    public static void main(String[] args) {

        /**
         * / 名称分隔符 separator
         * 建议 1. /  path = "G:/Algorithm/src/javaSE/IO";
         * 2.常量拼接 path = "G:"+File.separator+"Algorithm"+File.separator+"src"+File.separator+"javaSE"+File.separator+"IO";
         */
        System.out.println(File.separatorChar);

        String path = "G:\\Algorithm\\src\\javaSE\\IO";
        String path2 = "G:/Algorithm/src/javaSE/IO";
        String path3 = path = "G:"+File.separator+"Algorithm"+File.separator+"src"+File.separator+"javaSE"+File.separator+"IO";

        System.out.println(path);
        System.out.println(path2);
        System.out.println(path3);

        //
        //

    }
}
