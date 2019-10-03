package javaSE.arrays;

import java.util.Arrays;

/**
 * 测试数组存储表格数据
 */
public class TestArrayTableData {
    public static void main(String[] args) {
        Object[] emp1 = {1001,"小一",18,"程序员","2019-2-14"};
        Object[] emp2 = {1002,"小二",19,"助教","2019-2-15"};
        Object[] emp3 = {1002,"小三",20,"讲师","2019-2-16"};

        Object[][] tableData = new Object[3][];
        tableData[0] = emp1;
        tableData[1] = emp2;
        tableData[2] = emp3;

        for (Object[] i:tableData)
         System.out.println(Arrays.toString(i));
    }
}
