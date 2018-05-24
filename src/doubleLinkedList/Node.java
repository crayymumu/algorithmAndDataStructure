package doubleLinkedList;

import java.util.Objects;

public class Node implements Cloneable{
    Node next;// 节点的引用，指向下一个节点
    Node before;// 节点的引用，指向前一个节点
    Object data;// 节点的对象，即内容

    @Override
    public Object clone() {
        Node node = null;
        try{
            node = (Node)super.clone();
        }catch(CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return node;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Node)) return false;
        Node node = (Node) o;
        return Objects.equals(next, node.next) &&
                Objects.equals(before, node.before) &&
                Objects.equals(data, node.data);
    }

    @Override
    public int hashCode() {

        return Objects.hash(next, before, data);
    }

    public Node() {
        data = null;
    }
    public Node(Object data) {
        this.data = data;
    }
}
