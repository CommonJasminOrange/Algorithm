package javaSE.Collection.TestArrayList;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Demo4 {
    public static void main(String[] args) {
        Set<String> aSet = new HashSet<>();
        ArrayList<String> bList = new ArrayList<>();
        aSet.add("4");
        aSet.add("5");
        aSet.add("6");
        bList.add("1");
        bList.add("1");
        bList.add("2");
        bList.add("2");
        bList.add("3");
        bList.add("3");
        bList.add("3");

        boolean flag = aSet.containsAll(bList);
        System.out.println(flag);
        aSet.addAll(bList);
        boolean flag2 = aSet.containsAll(bList);
        System.out.println(flag2);
        Set<String> cSet = new HashSet<>(bList);



        bList.forEach(temp->{
            System.out.println(temp);
        });
        //bList.addAll(aSet);
        System.out.println("####################");
        bList.clear();
        bList.addAll(cSet);

        //遍历HashSet中的所有数据
        bList.forEach(temp->{
            System.out.println(temp);
        });
//        cSet.forEach(temp->{
//            System.out.println(temp);
//        });
    }
}
