package javaSE.Collection.StoreData;

import java.util.*;

/**
 * 测试表格数据的存储
 * 体会 ORM思想 （对象映射关系）
 * 每一行数据使用一个Map
 * 整个表格使用一个List
 *
 */
public class TestStoreData {
    public static void main(String[] args) {
        Map<String,Object> row1 = new HashMap<>();
        row1.put("id",1001);
        row1.put("name","张三");
        row1.put("salary",10000);
        row1.put("time","2019.10.10");

        Map<String,Object> row2 = new HashMap<>();
        row2.put("id",1002);
        row2.put("name","李四");
        row2.put("salary",15000);
        row2.put("time","2017.10.10");

        Map<String,Object> row3 = new HashMap<>();
        row3.put("id",1003);
        row3.put("name","王五");
        row3.put("salary",25000);
        row3.put("time","2014.10.10");

        List<Map<String,Object>> table1 = new ArrayList<>();
        table1.add(row1);
        table1.add(row2);
        table1.add(row3);

        for (Map<String,Object> row:table1){
            Set<String> keySet = row.keySet();
            for (String key:keySet){
                System.out.print(key+":"+row.get(key)+"\t");
            }
            System.out.println();
        }
    }
}
