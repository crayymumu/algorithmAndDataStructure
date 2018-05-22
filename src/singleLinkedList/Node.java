package singleLinkedList;

public class Node {
    Node next;// 节点的引用，指向下一个节点
    Object data;// 节点的对象，即内容

    public Node() {
        data = null;
    }

    public Node(Object data) {
        this.data = data;
    }
}
