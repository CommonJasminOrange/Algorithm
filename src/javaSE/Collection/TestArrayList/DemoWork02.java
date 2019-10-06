package javaSE.Collection.TestArrayList;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class DemoWork02 {
    public static void main(String[] args) {
        Character[] chs = {'a','z','g','b','p','c'};
        //将char数组转成集合  Arrays Collections
        List<Character> chars = Arrays.asList(chs);

        Collections.sort(chars);
        chars.forEach(temp->{
            System.out.print(temp+"\t");
        });
        System.out.println("-------------------------------------------");
        //逆序输出
        Collections.reverse(chars);
        chars.forEach(temp->{
            System.out.print(temp+"\t");
        });

    }
}