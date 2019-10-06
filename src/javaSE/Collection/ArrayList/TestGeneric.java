package javaSE.Collection.ArrayList;

import dataStructure.linetable.ArrayList;
import dataStructure.linetable.List;

import java.util.HashMap;
import java.util.Map;

/**
 * 测试泛型
 */
public class TestGeneric {
    public static void main(String[] args) {
        MyCollection<String> mc = new MyCollection<>();
        mc.set("欢欢",0);

        String b = mc.get(0);

        List list = new ArrayList();
        Map map = new HashMap();

    }
}

class MyCollection<E> {
    Object[] objs = new Object[5];

    public void set(E e,int index){
        objs[index] = e;
    }

    public E get(int index){
        return (E)objs[index];
    }
}