package dataStructure.singleLinkedList;

import java.util.Objects;

public class Node {
    Node next;// 节点的引用，指向下一个节点
    Object data;// 节点的对象，即内容

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Node)) return false;
        Node node = (Node) o;
        return Objects.equals(next, node.next) &&
                Objects.equals(data, node.data);
    }

    @Override
    public int hashCode() {

        return Objects.hash(next, data);
    }

    public Node() {
        data = null;
    }

    public Node(Object data) {
        this.data = data;
    }
}
