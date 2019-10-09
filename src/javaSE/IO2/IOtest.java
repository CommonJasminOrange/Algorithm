package javaSE.IO2;


import java.io.*;

public class IOtest {
    public static void main(String[] args) {
        //1.创建源
        //2.选择流
        //3.操作
        //4.释放资源
        File src = new File("a.txt");

            InputStream is = null;
        try {
            is = new FileInputStream(src);
            int temp;
            while ((temp = is.read()) != -1){
                System.out.println((char) temp);
            }
            is.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                is.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}