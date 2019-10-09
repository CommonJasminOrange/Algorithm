package javaSE.IO2;

import java.io.*;

/**
 * 文件字节输出
 * 1.创建源
 * 2.选择流
 * 3.操作
 * 4.释放资源
 */
public class IOTest04 {
    public static void main(String[] args) {

        File dest = new File("dest.txt");

        OutputStream os = null;

            try {
                os = new FileOutputStream(dest,true);
                String msg = "IO is so hard!\n";
                byte[] dates = msg.getBytes(); //字符串->字节数组 （编码）
                os.write(dates,0,dates.length);
                os.flush();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    //4.释放资源
                    os.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

    }



}
