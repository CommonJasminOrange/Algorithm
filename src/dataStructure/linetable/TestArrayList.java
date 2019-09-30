package dataStructure.linetable;

public class TestArrayList {

    public static void main(String[] args){

        List list = new ArrayList();

        list.add(123);
        list.add(321);
        list.add(456);
        list.add(678);
       // list.add(789);

        System.out.println(list.size());
        System.out.println(list.isEmpty());
        System.out.println(list.get(3));
    }
}
