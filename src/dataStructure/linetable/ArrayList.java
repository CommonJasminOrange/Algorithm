package dataStructure.linetable;

/**
 * 顺序表
 * 底层采用的数组，但长度可以动态变化
 */


public class ArrayList implements List{

    //底层是一个数组,目前未确定长度
    private Object[] elementData;

    //不是数组分配了几个空间，而是元素的个数
    private int size;

    public ArrayList(){
        //没有指定长度，默认长度是4
        this(4);
        //没有指定长度，长度是0
        //elementData  = new Object[]{};
    }

    /**
     *
     * @param initialCapacity 指定的初始长度
     */
    public ArrayList(int initialCapacity){
        //给数组分配指定数量的空间
        elementData = new Object[initialCapacity];
        //指定顺序表的元素个数，默认是0
        size = 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public Object get(int i) {

        if (i < 0 || i > size - 1){
            //throw new RuntimeException("数组索引越界异常："+i);
            throw new MyArrayIndexOutOfBoundsException("数组索引越界异常："+i);
        }

        return elementData[i];
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean contains(Object e) {
        return false;
    }

    @Override
    public int indexOf(Object e) {
        return 0;
    }

    @Override
    public void add(int i, Object e) {

    }

    @Override
    public void add(Object e) {

        //如果数组满了，那就扩容
        if (size == elementData.length){
            //新创建一个新的数组。长度是旧数组的2倍
            Object [] newArr = new Object[elementData.length * 2];
            //把旧数组的数据拷贝到新数组
            for (int i = 0; i < size; i++){
                newArr[i] = elementData[i];
            }
        }

        //给数组赋值
        elementData[size] = e;
        //元素个数+1
        size++;
        //elementData[size++] = e;

    }

    @Override
    public boolean addBefore(Object obg, Object e) {
        return false;
    }

    @Override
    public boolean addAfter(Object obg, Object e) {
        return false;
    }

    @Override
    public Object remove(int i) {
        return null;
    }

    @Override
    public boolean remove(Object e) {
        return false;
    }

    @Override
    public Object replace(int i, Object e) {
        return null;
    }
}
