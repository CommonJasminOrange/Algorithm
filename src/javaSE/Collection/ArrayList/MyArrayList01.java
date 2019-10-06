package javaSE.Collection.ArrayList;

/**
 * 1.自定义实现一个ArrayList，体会底层原理
 *
 */
public class MyArrayList01 {

    private Object[] elementData;
    private int size;
    private static final int DEFALT_CAPACITY = 10;

    public MyArrayList01(){
        elementData = new Object[DEFALT_CAPACITY];
    }

    public MyArrayList01(int capacity){
        elementData = new Object[capacity];
    }
    public void add(Object obj){
        elementData[size++] = obj;

    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("[");
        for (int i = 0; i < size; i ++) {
            sb.append(elementData[i]+",");
        }
        sb.setCharAt(sb.length()-1,']');
        return sb.toString();

    }

    public static void main(String[] args) {
        MyArrayList04 s1 = new MyArrayList04(20);
        s1.add("aa");
        s1.add("bb");
        System.out.println(s1);
    }
}
