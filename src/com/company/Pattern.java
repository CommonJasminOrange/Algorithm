package com.company;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Pattern {




    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String url = sc.nextLine();
        int index = url.indexOf("&");
        String param = url.substring(index+1);

        String[] params = param.split("&");

        Map<String,String> map = new HashMap<>();

        for (String item:params) {
            String[] kv = item.split("=");
            map.put(kv[0],kv[1]);
        }
        System.out.println(map);
    }


}
