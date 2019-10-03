package javaSE.CommonClass;

public class TestStringBuilder2 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i <26; i ++){
            char temp = (char)('a'+i);
            sb.append(temp);
        }

        System.out.println(sb);

        sb.reverse();
        System.out.println(sb);
        sb.setCharAt(3,'欢');
        System.out.println(sb);
        //链式调用，核心就是：该方法调用了 return this  把自己返回了
        sb.insert(0,'欢').insert(6,'我').insert(9,'爱').insert(12,'你');
        System.out.println(sb);
        sb.delete(20,23).delete(24,26);
        System.out.println(sb);
    }
}
