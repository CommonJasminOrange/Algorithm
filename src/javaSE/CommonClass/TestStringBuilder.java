package javaSE.CommonClass;

/**
 * StringBuilder SringBuffer 可变字符序列  String 不可变字符序列
 */

public class TestStringBuilder {
    public static void main(String[] args) {
        String str;

        /**
         * StringBuilder 线程不安全 效率高(一般用它) StringBuffer 线程安全 效率低
         */
        StringBuilder sb = new StringBuilder("abcdefg");
        StringBuffer sb2 = new StringBuffer();

        System.out.println(Integer.toHexString(sb.hashCode()));
        System.out.println(sb);

        sb.setCharAt(2,'C');
        System.out.println(Integer.toHexString(sb.hashCode()));
        System.out.println(sb);
    }
}
