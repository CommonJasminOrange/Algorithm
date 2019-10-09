package javaSE.Collection.Map.MyHashMap;

import java.util.Map;
import java.util.TreeMap;

/**
 * 给定一个字符串
 * 统计每个字符出现的次数
 * TreeMap<String,Integer> key是String value是Integer
 */
public class TreeMapDemo {
    public static void main(String[] args) {
        String str = "xn,,o";

        //1.将字符串转成字符数组
        char[] chs = str.toCharArray();
        //2.取出chs中的某个元素，看容器是否存在
        Map<String,Integer> treemap = new TreeMap<>();
        for (char temp:chs){
            Integer value = treemap.get(temp+""); // temp='a'
            if (value == null){ // 指定字符不存在
                treemap.put(temp+"",1);
            } else { //指定字符不存在
                value++;
                treemap.put(temp+"",value);
            }
        }

        treemap.forEach((k,v)->{
            System.out.println(k+"="+v);
        });


    }
}
