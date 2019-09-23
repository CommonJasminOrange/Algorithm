package com.company;

import java.util.Scanner;

public class zshf {

    public static int q(int n,int m){
        if (n < 1 || m < 1) return 0;

        if (n == 1 || m == 1) return 1;

        if (n < m) return q(n, n);

        if (n == m) return  q(n, m - 1) + 1;

        return q(n, m - 1) + q(n - m, m);

    }

    public static void main(String[] args){

//        Scanner in = new Scanner(System.in);
//        System.out.println("输入需要划分的正整数");
//        int n = in.nextInt();
//        System.out.println("输入最大加数");
//        int m = in.nextInt();
        zshf k = new zshf();
        int n = 6,m=6;
        System.out.println(k.q(n,m));

    }
}
