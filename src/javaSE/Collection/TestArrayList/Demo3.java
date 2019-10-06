package javaSE.Collection.TestArrayList;


import java.util.LinkedList;
import java.util.List;

public class Demo3 {
    public static void main(String[] args) {
        List<String> bookList = new LinkedList<>();
        bookList.add("java从入门到放弃");
        bookList.add("oop");
        bookList.add("HTML");

        //将List集合转为数组
        Object[] objects = bookList.toArray();

    }
}
