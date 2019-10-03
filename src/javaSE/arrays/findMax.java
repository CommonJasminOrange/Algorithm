package javaSE.arrays;

public class findMax {
    public static void main(String[] args) {
        int[] a ={1,2,30,4,5,6,77,8,9,10};
        int x = a[0];

        for (int i = 0; i < a.length; i ++){
            if (x < a[i]){
                x = a[i];
            }
        }
        System.out.println(x);
    }
}
