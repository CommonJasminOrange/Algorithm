package javaSE.IO2;


import java.io.*;

public class IOtest2 {
    public static void main(String[] args) {
        //1.创建源
        //2.选择流
        //3.操作
        //4.释放资源

       File src = new File("a.txt");
       OutputStream os = null;
        try {
            os = new FileOutputStream(src,true);
            String str = "sssssaqedsfsas\n";
            byte[] dates = str.getBytes();
            os.write(dates,0,dates.length);
            os.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                os.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}