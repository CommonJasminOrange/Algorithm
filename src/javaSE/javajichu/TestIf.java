package javaSE.javajichu;
public class TestIf {
    //if语句
    public static void main(String[] args) {
        int i = (int) (100 * Math.random());
        System.out.print("年龄是"+i+"岁，");
        if (i <= 15){
            System.out.println("儿童，喜欢玩");
        }else if (i <=25){
            System.out.println("青年，要学习");
        }else if (i <= 45){
            System.out.println("中年，要养家");
        }else if (i <= 65){
            System.out.println("老年，要补钙");
        }else if (i <= 85){
            System.out.println("快死了，要住院");
        }else{
            System.out.println("去岁吧");
        }
    }
}