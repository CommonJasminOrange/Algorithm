package javaSE.IO2;

import java.io.*;

/**
 * 分段读取 （文件字节输入）
 * 1.创建源
 * 2.选择流
 * 3.操作
 * 4.释放资源
 */
public class IOTest03 {
    public static void main(String[] args) {

        //1.创建源
        File src = new File("a.txt");
        InputStream is = null;
        //2.选择流
        try {
            is = new FileInputStream(src);
            //3.操作
            byte[] car = new byte[1024]; //缓冲容器 每三个读取一次
            int len = -1; //接收长度
            while ((len = is.read(car)) != -1) {
                //字节数组->字符串 （解码）
                String str = new String(car,0,len);
                System.out.println(str);
            }



        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
            //4.释放资源
        } finally {
            try {
                if (is != null) {
                    is.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
