package javaSE.IO2;

import java.io.*;

/**
 * 1.封装拷贝
 * 2.封装释放资源
 */
public class FileUtils {
    public static void main(String[] args) {
        //文件到文件
        try {
            InputStream is = new FileInputStream("a.txt");
            OutputStream os = new FileOutputStream("a-copy.txt");
            copy(is, os);

        } catch (IOException e) {
            e.printStackTrace();
        }
        //文件到字节数组
        byte[] dates = null;
        try {
            InputStream is = new FileInputStream("p.png");
            ByteArrayOutputStream os = new ByteArrayOutputStream();
            copy(is, os);
            dates = os.toByteArray();
            System.out.println(dates.length);
        } catch (IOException e) {
            e.printStackTrace();
        }
        //字节数组到文件
        try {
            InputStream is = new ByteArrayInputStream(dates);
            OutputStream os = new FileOutputStream("p-copy.png");
            copy(is, os);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //对接输入输出流
    public static void copy(InputStream is, OutputStream os) {

        try {
            //3.操作1 (分段读取)
            byte[] flush = new byte[1024]; //缓冲容器
            int len = -1; //接收长度
            while ((len = is.read(flush)) != -1) {
                os.write(flush, 0, len);  //分段写出
            }
            os.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //4.释放资源 分别关闭 先打开的后关闭
            close(is, os);
        }

    }

    //释放资源
//    public static void close(InputStream is, OutputStream os) {
//        try {
//            if (os != null) {
//                os.close();
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        try {
//            if (os != null) {
//                is.close();
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
    //释放资源  可变变量
    public static void close(Closeable... ios) {
        for (Closeable io : ios) {
            try {
                if (io != null) {
                    io.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }

}
