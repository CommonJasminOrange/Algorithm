package javaSE.Collection.ArrayList;

/**
 * 1.自定义实现一个ArrayList，体会底层原理
 * 2.增加泛型
 * 3.数组扩容
 */

public class MyArrayList03<E> {

    private Object[] elementData;
    private int size;
    private static final int DEFALT_CAPACITY = 10;

    public MyArrayList03(){
        elementData = new Object[DEFALT_CAPACITY];
    }

    public MyArrayList03(int capacity){
        elementData = new Object[capacity];
    }
    public void add(E element){

        //什么时候扩容??
        if (size == elementData.length){
            //扩容操作 10 --> 10 + 10/2
            Object[] newArray = new Object[elementData.length+(elementData.length>>1)];
            System.arraycopy(elementData,0,newArray,0,elementData.length);
            elementData = newArray;
        }
        elementData[size++] = element;

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

        for (int i = 0; i <40; i ++){
            s1.add("g"+i);
        }

        System.out.println(s1);
    }
}
