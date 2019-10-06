package javaSE.Collection.Map;

import java.util.HashMap;
import java.util.Map;

/**
 * 测试map
 * map中键不能重复！如果重复，则新的覆盖旧的
 */


public class TestMap {
    public static void main(String[] args) {
        Map<Integer,String> m1 = new HashMap<>();

        m1.put(0,"a");
        m1.put(1,"b");
        m1.put(2,"c");
        m1.put(3,"d");

        System.out.println(m1);
        System.out.println(m1.get(3));
        System.out.println(m1.size());
        System.out.println(m1.isEmpty());
        System.out.println(m1.containsKey(2));
        System.out.println(m1.containsValue("d"));

        Map<Integer,String> m2 = new HashMap<>();
        m2.put(4,"e");
        m2.put(5,"f");
        m1.putAll(m2);
        System.out.println(m1);




    }
}
