package javaSE.Collection.Map.MyHashMap;

/**
 * 1.自定义一个HashMap
 * 2.实现了put方法增加键值对，并解决了键重复时覆盖相应的节点
 * 3.实现toString方法，方便查看Map中的键值对信息
 * 4.实现get方法，根据键对象获得相应的值对象
 */
public class MyHashMap01 {

    Node2[] table; //位桶数组 bucket array
    int size; //存放键值对的个数

    public MyHashMap01(){
        table = new Node2[16]; //长度一般定义为2的整数幂
    }


    @Override
    public String toString() {
        //{10:aa,20:bb}
        StringBuilder sb = new StringBuilder('{');

        //遍历bucket数组
        for (int i = 0; i < table.length; i ++){
            Node2 temp = table[i];
            //遍历链表
            while (temp != null){
                sb.append(temp.key+":"+temp.value+",");
                temp = temp.next;
            }

        }
        sb.setCharAt(sb.length()-1,'}');
        return sb.toString();
    }

    public Object get(Object key){
        int hash = myHash(key.hashCode(),table.length);
        Object value = null;

        if (table[hash] != null){
            Node2 temp = table[hash];
            while (temp != null){
                if (temp.key.equals(key)){ //如果相等 这说明找到了键值对，返回相应的value
                    value = temp.value;
                    break;
                } else {
                    temp = temp.next;
                }
            }
            return value;
        }

        return value;
    }

    public void put(Object key, Object value){
        //如果要完善 还要考虑数组扩容问题!!!

        //定义了新的节点对象
        Node2 newNode = new Node2();
        newNode.hash = myHash(key.hashCode(),table.length);
        newNode.key = key;
        newNode.value = value;
        newNode.next = null;

        Node2 temp = table[newNode.hash];

        Node2 iterLast = null;
        boolean keyRepeat = false;

        if (temp == null){
            //此处数组元素为空，则直接将新节点放进去
            table[newNode.hash] = newNode;
        } else {
            //此处数组元素不为空，则遍历对应链表
            while(temp != null){
                //判断key如果重复，则覆盖
                if (temp.key.equals(key)){
                    keyRepeat = true;
                    temp.value = value; //只是覆盖value即可，其他得值(hash,key,next)保持不变
                    break;
                }else{
                    //key不重复，则遍历下一个
                    iterLast = temp;
                    temp = temp.next;
                }
            }

            if (!keyRepeat){ //如果没有发生key重复的情况，则添加到链表表最后
                iterLast.next = newNode;
            }


        }


    }

    public static void main(String[] args) {

        MyHashMap01 m = new MyHashMap01();
        m.put(10,"aa");
        m.put(20,"bb");
        m.put(30,"cc");
        m.put(20,"sss");
        m.put(53,"gg");
        m.put(69,"hh");
        m.put(85,"jj");

        System.out.println(m);

        System.out.println(m.get(69));
    }



    public int myHash(int v,int length){
//        System.out.println("hash in myHash:" + (v&(length-1))); //位运算，效率高
//        System.out.println("hash in myHash:" + (v%(length-1))); //取模运算，效率低
        return v & (length-1);
    }
}
