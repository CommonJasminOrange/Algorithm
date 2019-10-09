package javaSE.IO.EnCode;

import java.io.UnsupportedEncodingException;

/**
 * 解码  字节-> 字符串
 * 乱码 1.字节数不够 2.字符集不统一
 */
public class ContentDecode {
    public static void main(String[] args) throws UnsupportedEncodingException {
        //编码
        String msg = "姓名生命使命a";
        byte[] dates = msg.getBytes();

        //解码 字符串 String(byte[] bytes,int offset,int length,String charsetName)
        msg = new String(dates,0,dates.length,"utf-8");
        System.out.println(msg);
        msg = new String(dates,0,dates.length-2,"utf-8");
        System.out.println(msg);
        msg = new String(dates,0,dates.length-1,"utf-8");
        System.out.println(msg);
        msg = new String(dates,0,dates.length-1,"gbk");
        System.out.println(msg);


    }
}
