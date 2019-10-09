package javaSE.IO2;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

/**
 * 字节数组输出流
 * 1.创建源  : 内部维护
 * 2.选择流  ： 不关联源
 * 3.操作
 * 4.释放资源
 *
 * 获取数据： toByteArray
 */
public class IOTest08 {

    public static void main(String[] args) {

        byte[] dest = null;
        //2. 选择流 （使用新增方法，不发生多态）
        ByteArrayOutputStream baos = null;

            try {
                baos = new ByteArrayOutputStream();
                //3.操作（写出）
                String msg = "IO is so hard";
                byte[] dates = msg.getBytes(); //字符串->字节数组 （编码）
                baos.write(dates,0,dates.length);
                baos.flush();
                //获取数据
                dest = baos.toByteArray();
                System.out.println(dest.length+"-->"+new String(dest,0,baos.size()));
            } catch (IOException e) {
                e.printStackTrace();
            }

    }



}
