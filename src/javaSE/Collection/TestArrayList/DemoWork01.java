package javaSE.Collection.TestArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class DemoWork01 {
    public static void main(String[] args) {
        System.out.println("请输入5名学员的成绩");
        //定义集合容器，用来存放数据
        List<Float> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        Float sum = 0F; //累加器
        for (int i = 0;i < 5; i ++) {
            Float score = sc.nextFloat();
            sum += score;
            list.add(score);
        }

        //对List集合进行排序
        Collections.sort(list);
        int index = list.size()-1;
        float avg = sum / list.size();
        Float maxScore = list.get(index);
        System.out.println("考试成绩最高分:"+maxScore);
        System.out.println("平均分:"+avg);

        list.forEach(temp->{
            System.out.print(temp+"\t");
        });


    }
}
