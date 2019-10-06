package javaSE.Collection.LinkedList;

public class Node {
    Node previous; //上一个节点
    Node next; //下一个节点
    Node element; //元素数据

    public Node(Node previous, Node next, Node element) {
        this.previous = previous;
        this.next = next;
        this.element = element;
    }

    public Node(Node element) {
        this.element = element;
    }
}
