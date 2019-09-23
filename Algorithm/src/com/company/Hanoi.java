package com.company;

public class Hanoi {

    static int i = 1;

    public static void move(char x, int  n, char y){

            System.out.println((i++)+":把编号为" + n + "的盘子从" + x + "移动到" + y);

    }

    public static void hanoi(int n, char A, char B, char C){

        if (n == 1){
            move (A , 1 , C);
        }else {
            hanoi(n-1, A, C, B);
            move(A, n , C);
            hanoi(n-1, B, A, C);
        }

    }

    public static void main(String[] args ){

        hanoi(6, 'A', 'B', 'C');
    }
}
