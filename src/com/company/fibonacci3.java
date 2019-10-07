package com.company;

import java.util.HashMap;
import java.util.Map;

public class fibonacci3 {

    private static Map<Integer,Integer> hm = new HashMap<>();

    public static int fibonacci(int n){

        if (n == 0 || n == 1){
            return 1;
        }
        if (hm.containsKey(n))  {
            return hm.get(n);
        } else {
            int value = fibonacci(n-1)+fibonacci(n-2);
            hm.put(n,value);
            return value;
        }


    }
    public static void main(String[] args) {
        System.out.println(fibonacci(5));

    }
}
