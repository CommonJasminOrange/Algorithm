package javaSE.arrays;

import java.util.Arrays;

/**
 * 测试数组的拷贝 删除 扩容 插入
 */
public class TestArrayCopy {
    public static void main(String[] args) {
        //testBasicCopy();
        String[] str = {"小一","小二","小三","小四","小五"};
        //extendRange(str);
        //removeElement(str, 4);
        insertElement(str,3,"小刘");

    }


    public static void testBasicCopy(){
        String[] s1 = {"aa","bb","cc","dd","ee","ff"};
        String[] s2 = new String[10];
        System.arraycopy(s1,2,s2,6,3);

        String t = Arrays.toString(s2);
        System.out.println(t);
    }
    /**
     * 测试从数组中删除某个元素 （本质上还是数组的拷贝）
     * 删除数组中指定索引位置的元素，并将原数组返回
     */
    public static String[] removeElement(String[] s, int index){

        System.arraycopy(s,index+1,s,index,s.length-index-1);
        s[s.length-1] = null;

        String t = Arrays.toString(s);
        System.out.println(t);

        return s;
    }

    /**
     * 数组插入元素
     */
    public static String[] insertElement(String[] s, int index,String element){

        String[] s2 = new String[s.length+1];
        System.arraycopy(s,0,s2,0,index);
        s2[index] = element;
        System.arraycopy(s,index,s2,index+1,s.length-index);
        String t = Arrays.toString(s2);
        System.out.println(t);

        return s2;
    }

    /**
     * 数组的扩容 （本质上是 先定义一个数组，然后将原数组原封不动拷贝到新数组中）
     */
    public static String[] extendRange(String[] s1){
    //    String[] s1 = {"小一","小二","小三","小四","小五"};

        String[] s2 = new String[s1.length+10];

        System.arraycopy(s1,0,s2,0,s1.length);

        String t = Arrays.toString(s2);
        System.out.println(t);

        return s2;
    }
}
