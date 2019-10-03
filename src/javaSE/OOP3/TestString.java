package javaSE.OOP3;

/**
 * 测试String类的基本用法
 */
public class TestString {
    public static void main(String[] args) {
        String str = "abc";
        String str2 = new String("def");
        String str3 = "abc" + "defg";
        String str4 = "18" + 19;
        System.out.println(str4);

        System.out.println("##################");
        String str10 = "欢欢";
        String str11 = "欢欢";
        String str12 = new String("欢欢");
        System.out.println(str10 == str11);
        System.out.println(str11 == str12); //str11 和 str12 不是同一个对象

        //通常比较字符串时，使用equals
        System.out.println(str12.equals(str11));
    }
}
