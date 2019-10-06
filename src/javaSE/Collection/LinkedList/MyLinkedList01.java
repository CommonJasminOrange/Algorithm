package javaSE.Collection.LinkedList;

/**
 * 自定义一个链表
 */

public class MyLinkedList01 {

    private Node first;
    private Node last;

    private int size;

    public void add(Object obj){
        //[] ["a"]
        Node node = new Node((Node) obj);

        if (first == null){

//            node.previous = null;
//            node.next = null;
            first = node;
            last = node;
        }else{
            node.previous = last;
            node.next = null;
            last.next = null;
        }
    }
}
