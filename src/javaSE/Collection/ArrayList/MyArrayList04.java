package javaSE.Collection.ArrayList;

/**
 * 1.自定义实现一个ArrayList，体会底层原理
 * 2.增加泛型
 * 3.数组扩容
 * 4.增加索引越界检查
 */

public class MyArrayList04<E> {

    private Object[] elementData;
    private int size;
    private static final int DEFALT_CAPACITY = 10;

    public MyArrayList04(){
        elementData = new Object[DEFALT_CAPACITY];
    }

    public MyArrayList04(int capacity){

        if (capacity < 0){
            throw new RuntimeException("容器容量不能为负数");
        }else if (capacity == 0){
            elementData = new Object[DEFALT_CAPACITY];
        }else{
            elementData = new  Object[capacity];
        }
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

    public E get(int index){
        checkRange(index);
        return (E) elementData[index];
    }

    public void set(E element,int index){

        checkRange(index);
        elementData[index] = element;



    }
    public void checkRange(int index){

        //索引合法判断[0,size) 10  0-9
        if (size < 0 | index > size - 1){
            //不合法
            throw new RuntimeException("索引不合法："+index);
        }
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

        s1.set("dd",10);
        System.out.println(s1);
        System.out.println(s1.get(39));
    }
}
