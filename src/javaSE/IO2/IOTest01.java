package javaSE.IO2;

import java.io.*;

/**
 * 第一个程序 理解操作步骤
 * 1.创建源
 * 2.选择流
 * 3.操作
 * 4.释放资源
 */
public class IOTest01 {
    public static void main(String[] args) {

        //1.创建源
        File src = new File("a.txt");

        //2.选择流
        try {
            InputStream is = new FileInputStream(src);
            //3.操作
            int data1 = is.read(); //第1个数据h
            int data2 = is.read(); //第2个数据e
            int data3 = is.read(); //第3个数据l
            int data4 = is.read(); //??不是数据 文件的末尾返回-1
            System.out.println((char) data1);
            System.out.println((char) data2);
            System.out.println((char) data3);
            System.out.println(data4);

            //4.释放资源
            is.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
