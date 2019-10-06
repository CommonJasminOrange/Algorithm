package javaSE.CommonClass;

/**
 * 测试枚举类
 */
public class TestEnum {
    public static void main(String[] args) {
        System.out.println(Season.SPRING);

        Season a = Season.AUTUMN;

        switch (a){
            case SPRING:
                System.out.println("春天来了");
                break;
            case SUMMER:
                System.out.println("夏天来了");
                break;
            case AUTUMN:
                System.out.println("秋天来了");
                break;
            case WINTER:
                System.out.println("东天来了");
                break;

        }

    }
}

enum Season{
    SPRING,SUMMER,AUTUMN,WINTER
}

enum Week{
    MONDAY,TUESDAT,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY,SUNDAY
}
