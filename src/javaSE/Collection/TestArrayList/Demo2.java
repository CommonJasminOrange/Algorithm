package javaSE.Collection.TestArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Demo2 {
    public static void main(String[] args) {
        //集合只能存放引用数据类型 不能存放基本数据类型 自动装箱
        List<String> aList = new ArrayList<>();
        aList.add("王二麻子");
        aList.add("张三");
        aList.add("张三");
        aList.add("李四");

        List<Character> bList = new ArrayList<>();
        bList.add('a');
        bList.remove(0);

        //aList.remove(1);
        //根据内容删除
        aList.remove("张三");
        //aList.clear();
        aList.set(0,"xx");
        System.out.println(Arrays.toString(aList.toArray()));

        aList.forEach(i->{
            System.out.println(i);
        });
    }
}
