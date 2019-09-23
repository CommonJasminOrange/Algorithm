package com.company;

public class Main {

    public static void Perm(int list[],int k,int m){

        if (k == m){
            for (int i = 0; i <= m;i ++)
                System.out.print(list[i] + " ");
            System.out.println();

        } else {
            for (int i = k; i <= m;i ++){
                swap(list,k,i);
                Perm(list,k+1,m);
                swap(list,k,i);
            }
        }
    }

    public static void swap(int[] list, int x, int y) {
        int temp = list[x];
        list[x] = list[y];
        list[y] = temp;
    }


    public static void main(String[] args) {
        // write your code here
        int list[] = {1,2,3};
        Perm(list,0,2);
    }
}
