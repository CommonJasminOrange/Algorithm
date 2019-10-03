package javaSE.arrays;

import java.util.Arrays;
//Arrays工具类的使用
public class TestArrays {
    public static void main(String[] args) {
        int[] a = {11,66,23,95,1,4};
        int[] b = {1,2,3};

        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.binarySearch(a,95));

        Arrays.sort(a);
        System.out.println(Arrays.toString(a));

        System.out.println(Arrays.equals(a,b));

        System.out.println(Arrays.binarySearch(a,95));
    }
}
