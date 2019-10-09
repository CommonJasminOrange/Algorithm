package javaSE.IO2;

import java.io.*;

/**
 * 字节数组输入流
 * 分段读取
 * 1.创建源
 * 2.选择流
 * 3.操作
 * 4.释放资源 (可以不用释放资源)
 */
public class IOTest07 {
    public static void main(String[] args) {

        //1.创建源
        byte[] src = "talk is cheap,show me the code".getBytes();
        InputStream is = null;
        //2.选择流
        try {
            is = new ByteArrayInputStream(src);
            //3.操作
            byte[] car = new byte[5]; //缓冲容器
            int len = -1; //接收长度
            while ((len = is.read(car)) != -1) {
                //字节数组->字符串 （解码）
                String str = new String(car,0,len);
                System.out.println(str);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
