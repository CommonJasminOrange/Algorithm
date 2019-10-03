package javaSE.CommonClass;

import java.util.Date;

public class TestDate {
    public static void main(String[] args) {
        Date d = new Date(2000);
        System.out.println(d);
        System.out.println(d.getTime());

        Date d2 = new Date();
        System.out.println(d2.getTime());
        System.out.println(d2.after(d));

        Date d3 = new Date(2020,3,10);
        System.out.println(d3);
    }
}
