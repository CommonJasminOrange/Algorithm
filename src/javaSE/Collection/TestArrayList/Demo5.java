package javaSE.Collection.TestArrayList;

import java.util.Set;
import java.util.TreeSet;

public class Demo5 {
    public static void main(String[] args) {
        Set<Integer> aSet = new TreeSet<>();
        aSet.add(20);
        aSet.add(2);
        aSet.add(-2);
        aSet.add(-20);
        aSet.add(200);
        aSet.add(-80);
        aSet.add(70);
        aSet.add(60);
        aSet.forEach(temp->{
            System.out.print(temp+"\t");
        });

        System.out.println();
        System.out.println("--------------------------");

        Set<String> bSet = new TreeSet<>();
        bSet.add("z");
        bSet.add("d");
        bSet.add("a");
        bSet.add("x");
        bSet.add("cas");
        bSet.add("sxd");

        bSet.forEach(temp->{
            System.out.print(temp+"\t");
        });

    }
}
