package javaSE.CommonClass;

public class TestStringBuilder3 {
    public static void main(String[] args) {

        //使用String进行字符串拼接
        String str8 = "";
        long num1 = Runtime.getRuntime().freeMemory(); //获取系统剩余内存空间
        long time1 = System.currentTimeMillis(); //获取系统当前时间
        for (int i = 0; i < 5000; i ++){
            str8 = str8 + 1; //相当于产生了10000个对象
        }
        long num2 = Runtime.getRuntime().freeMemory(); //获取系统剩余内存空间
        long time2 = System.currentTimeMillis(); //获取系统当前时间
        System.out.println("String占用内存："+(num1-num2));
        System.out.println("String占用时间："+(time2-time1));

        //使用StringBuilder进行字符串拼接
        StringBuilder sb1 = new StringBuilder("");
        long num3 = Runtime.getRuntime().freeMemory(); //获取系统剩余内存空间
        long time3 = System.currentTimeMillis(); //获取系统当前时间
        for (int i = 0; i < 5000; i ++){
            sb1.append(i);
        }
        long num4 = Runtime.getRuntime().freeMemory(); //获取系统剩余内存空间
        long time4 = System.currentTimeMillis(); //获取系统当前时间
        System.out.println("StringBuilder占用内存："+(num3-num4));
        System.out.println("StringBuilder占用时间："+(time4-time3));
    }

}
