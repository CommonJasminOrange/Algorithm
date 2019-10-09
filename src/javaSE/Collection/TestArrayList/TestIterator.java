package javaSE.Collection.TestArrayList;

/**
 * 使用iterator遍历List,Set,Map
 *
 */

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class TestIterator {
    public static void main(String[] args) {
        testIteratorMap();
    }

    public static void testIteratorMap(){
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"aa");
        map.put(5,"bb");
        map.put(52,"cc");
        map.put(33,"dd");

        //使用iterator遍历List，Set
//        for (Iterator<String> iter = map.iterator(); iter.hasNext();){
//            String temp = iter.next();
//            System.out.println(temp);
//        }
        //1.使用iterator遍历Map
        Set<Entry<Integer, String>> entries = map.entrySet();
        for (Iterator<Entry<Integer,String>> iter = entries.iterator(); iter.hasNext();){
            Entry<Integer,String> temp = iter.next();
            System.out.println(temp.getKey()+"--"+temp.getValue());
        }

        //2.第二种方法遍历Map
        Set<Integer> keySet = map.keySet();
        for (Iterator<Integer> iter = keySet.iterator();iter.hasNext();){
            Integer key = iter.next();
            System.out.println(key+"=="+map.get(key));
        }
    }
}
