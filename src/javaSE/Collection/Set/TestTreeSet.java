package javaSE.Collection.Set;

import java.util.Set;
import java.util.TreeSet;

/**
 * 测试TreeSet使用
 * 熟悉Comparable接口（可以参考TreeMap）
 */

public class TestTreeSet {

    public static void main(String[] args) {
        Set<String> set = new TreeSet<>();

        set.add("sss");
        set.add("sds");
        set.add("ss");
        set.add("s");

        //按照元素递增的方式排序
        for (String temp : set){
            System.out.println(temp);
        }

        Set<Emp2> set2 = new TreeSet<>();
        set2.add(new Emp2(100,"张三",3000));
        set2.add(new Emp2(102,"赵柳",3000));
        set2.add(new Emp2(111,"李四",300));
        set2.add(new Emp2(11,"王五",30000));

        for (Emp2 temp : set2){
            System.out.println(temp);

        }
    }
}

class Emp2 implements Comparable<Emp2>{
    int id;
    String name;
    int salary;

    public Emp2(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "id:"+id+"name:"+name+"salary:"+salary;
    }

    @Override
    public int compareTo(Emp2 o) { //负数 小于0 等于 正数 大于
        if (this.salary > o.salary){
            return 1;
        } else if (this.salary < o.salary) {
            return -1;
        } else {
            if (this.id > o.id){
                return 1;
            } else if (this.id < o.id){
                return -1;
            } else {
                return 0;
            }
        }
    }
}
