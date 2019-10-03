package javaSE.OOP3;

/**
 * 测试String 的常用方法
 */
public class TestString2 {
    public static void main(String[] args) {
        /**

        String s1 = "core Java";
        String s2 = "Core Java";
        System.out.println(s1.charAt(3)); //提取下标为3的字符

        System.out.println(s1.length()); //字符串的长度

        System.out.println(s1.equals(s2)); //字符串是否相等
        System.out.println(s1.indexOf("Java")); //返回"Java"值在字符串中首次出现的位置
        System.out.println(s1.indexOf("apple")); //若没有这个值存在，则返回-1

        String s = s1.replace(' ','&');//将s1中点空格替换成&
        System.out.println("result is:"+s);

         **/

        String s = "";
        String s1 = "How are you?";
        System.out.println(s1.startsWith("How"));
        System.out.println(s1.endsWith("you"));

        s = s1.substring(4); //截取字符串 从下标为4开始到字符串结尾处为止
        System.out.println(s);
        s =s1.substring(4,7); /** 下标为[4,7) 不包括7 **/
        System.out.println(s);

        s = s1.toLowerCase();//转小写
        System.out.println(s);
        s = s1.toUpperCase();//转大写
        System.out.println(s);

        String s2 = " How old are you?! ";

        s = s2.trim();//去除字符串首尾的空格 注意：中间的空格不能去除
        System.out.println(s);
        System.out.println(s2); //String是不可变字符，所以s2不变
    }
}
