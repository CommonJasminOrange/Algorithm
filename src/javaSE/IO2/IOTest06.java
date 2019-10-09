package javaSE.IO2;

import java.io.*;

/**
 * 文件字符输入流
 * 分段读取
 * 1.创建源
 * 2.选择流
 * 3.操作
 * 4.释放资源
 */
public class IOTest06 {
    public static void main(String[] args) {

        //1.创建源
        File src = new File("a.txt");
        Reader reader = null;
        //2.选择流
        try {
            reader = new FileReader(src);
            //3.操作
            char[] car = new char[1024]; //缓冲容器
            int len = -1; //接收长度
            while ((len = reader.read(car)) != -1) {
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
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
