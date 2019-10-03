package javaSE.OO2;
//测试封装
public class Person4 {

    //对于属性，一律私有
    private int id;
    private String name;
    private int age;
    private boolean man;

    //外部若想调用  提供 set方法  外部只能通过set方法来操作属性
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }

    public void setAge(int age){
        if (age >=1 && age <= 130){
            this.age = age;
        }else {
            System.out.println("请输入正常的年龄!");
        }

    }

    public int getAge(){
        return this.age;
    }

}
