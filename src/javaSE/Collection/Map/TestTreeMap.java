package javaSE.Collection.Map;

import java.util.Map;
import java.util.TreeMap;

public class TestTreeMap {

    public static void main(String[] args) {
        Map<Integer,String> treeMap1 = new TreeMap<>();
        treeMap1.put(20,"aa");
        treeMap1.put(2,"bb");
        treeMap1.put(6,"cc");

        //按照key递增的方式排序
        for (Integer key : treeMap1.keySet()){
            System.out.println(key+"---"+treeMap1.get(key));
        }
        //forEach遍历
        treeMap1.forEach((k,v)->{
            System.out.println(k+"="+v);
        });

        Map<Emp,String> treeMap2 = new TreeMap<>();
        treeMap2.put(new Emp(100,"张三",50000),"张三很棒");
        treeMap2.put(new Emp(200,"李四",5000),"李四很棒");
        treeMap2.put(new Emp(150,"王五",500),"王五很棒");
        treeMap2.put(new Emp(50,"赵柳",500),"赵柳很棒");

        //按照key递增的方式排序
        for (Emp key : treeMap2.keySet()){
            System.out.println(key+"---"+treeMap2.get(key));
        }
    }
}

class Emp implements Comparable<Emp>{
    int id;
    String name;
    double salary;

    public Emp(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "id:"+id+",name:"+name+",salary:"+salary;
    }

    @Override
    public int compareTo(Emp o) {  //负数：小于 0：等于 正数 大于

        if (this.salary > o.salary){
            return 1;
        } else if (this.salary < o.salary){
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
