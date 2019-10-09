package javaSE.Collection.Collections;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Collections工具类的使用
 * Collection 是接口，Collections是工具类！！！
 */
public class TestCollections {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        for (int i = 0;i < 10; i ++){
            list.add("gao"+i);
        }
        System.out.println(list);

        Collections.shuffle(list);  //随机排列
        System.out.println(list);

        Collections.reverse(list); //逆序排列
        System.out.println(list);

        Collections.sort(list); //按照递增的顺序排序，自定义类的使用（Comparable接口）
        System.out.println(list);

        int co = Collections.binarySearch(list,"gao8"); //二分法查找
        System.out.println(co);
    }
}
