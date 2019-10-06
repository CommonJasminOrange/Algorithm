package javaSE.Collection.TestArrayList;

/**
 *
 * ArrayList底层是Object数组
 *
 * 添加：集合对象名.add(实参);
 * 删除：集合对象名.remove(下标); 集合对象名.remove(指定删除内容); 备注 需要给集合指定泛型 .clear()清空
 * 修改：集合对象名.set(下标,新值);
 * 单个查询：集合对象名.get(下标);
 * 遍历：for foreach lambda表达式(forEach)
 *
 *
 */

import java.util.ArrayList;
import java.util.List;

public class Demo1 {
    public static void main(String[] args) {
        //Bolean,Character,Integer,Float 自动装箱了
        Object[] objAttr = {true,'好',12,3.14F};

        //默认可以存放 Object数据类型
        List aList = new ArrayList();
        aList.add(true);
        aList.add("好");
        aList.add(12);
        aList.add(3.14F);


        //遍历集合
        Object o1 = aList.get(3);
        System.out.println("o1="+o1);
        //方式1：for循环
        for (int i = 0; i < aList.size();i++){
            System.out.println(aList.get(i));
        }
        System.out.println("#######################");
        //方式2：foreach （高级for循环）
        for (Object i :aList){
            System.out.println(i);
        }
        System.out.println("#######################");
        //方式3： lambda表达式 (jdk1.8) (不能遍历数组)
        aList.forEach(i->{
            System.out.println(i);
        });

    }

}
