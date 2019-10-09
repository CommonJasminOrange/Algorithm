package javaSE.IO.EnCode;

import java.io.UnsupportedEncodingException;

/**
 * 编码  字符串->字节
 */
public class ContentEncode {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String msg = "姓名生命使命a";

        //编码 字节数组
        byte[] dates = msg.getBytes();  //默认使用工程字符集
        System.out.println(dates.length);

        //编码为其他字符集
        dates = msg.getBytes("UTF-16LE");
        System.out.println(dates.length);

        dates = msg.getBytes("GBK");
        System.out.println(dates.length);


    }
}
