package javaSE.IO2;

import java.io.*;

/**
 * 文件拷贝： 字节输入，输出流
 * 1.创建源
 * 2.选择流
 * 3.操作
 * 4.释放资源
 */
public class IOCopy {
    public static void main(String[] args) {
        IOCopy("a.txt","b.txt");

    }

    public static void IOCopy(String srcPath,String destPath){
        //1.创建源
        File src = new File(srcPath); //源头
        File dest = new File(destPath); //目的地
        //2.选择流
        InputStream is = null;
        OutputStream os = null;

        try {
            is = new FileInputStream(src);
            os = new FileOutputStream(dest);
            //3.操作1 (分段读取)
            byte[] flush = new byte[1024]; //缓冲容器
            int len = -1; //接收长度
            while ((len = is.read(flush))!= -1) {
                os.write(flush, 0, len);  //分段写出
            }
            os.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //4.释放资源 分别关闭 先打开的后关闭
            try {
                if (os != null) {
                    os.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

            try {
                if (os != null) {
                    is.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}


