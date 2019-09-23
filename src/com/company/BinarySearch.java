package com.company;
//非递归算法
public class BinarySearch {

    public static int BiSearch(int[] a, int x){

        int min = 0; int max = a.length - 1;
        while (min<=max){
            int mid = (min + max) / 2;
            if (x == a[mid]) return mid;
            if (x > a[mid]) min = mid + 1;
            else max = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args){
        int[] a ={15,22,34,49,50,51,78,79,93};
        int aim = BiSearch(a,78);
        System.out.println(aim);
    }
}
