package com.company;

public class fibonacci2 {


    public static int fibonacci(int n){
        if (n < 2){
            return 1;
        }else {
            int f0,f1,f2;
            f0 = f1 = 1;
            for (int i = 2; i <=n; i++){
                f2 = f0 + f1;
                f0 = f1;
                f1 = f2;
            }
            return f1;
        }
    }
    public static void main(String[] args) {

        System.out.println(fibonacci(5));

    }
}
