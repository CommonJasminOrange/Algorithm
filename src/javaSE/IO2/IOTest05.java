package javaSE.IO2;

import java.io.*;

/**
 * 文件字符输出流
 * 1.创建源
 * 2.选择流
 * 3.操作
 * 4.释放资源
 */
public class IOTest05 {
    public static void main(String[] args) {

        File dest = new File("dest.txt");

        Writer writer = null;

            try {
                writer = new FileWriter(dest,true);
                //3.操作（写出）
                //写法1
//                String msg = "IO is so hard!\n为啥打是";
//                char[] dates = msg.toCharArray(); //字符串->字节数组 （编码）
//                writer.write(dates,0,dates.length);
                //写法2
               // writer.write("sss爱谁打哈接口");
                //写法3
                writer.append("ss阿凡达\r\n").append("vdfdd");

                writer.flush();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    //4.释放资源
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

    }



}
