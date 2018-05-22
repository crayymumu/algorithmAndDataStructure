package singleLinkedList;

public class LinkList {
    private Node head;               // 头引用（指针）
    private Node rear;                // 尾引用（指针）
    private Node point;              //临时引用（指针）
    public int length;     //记录节点的长度

    public LinkList() { //构造函数用来初始化

        length = 0;
    }

    /**
    *@param:
    *@Description:向链表中插入节点
    *@Date:16:48 2018/5/17
    */
    public void addNode(Object d) {
        point = new Node(d);// 实例化一个节点
        if(head==null){
            head = point;//因为链表为空，所以将该节点作为首节点
            rear=head;//链表当前只有一个节点，所以首尾不分家
            length++;//链表的当前长度为1
            return;
        }
        rear.next = point;//尾节点指向临时节点
        rear = point;//因为新增了一个节点，所以尾节点也需要替换
        length++;
    }

    /**
    *@param:
    *@Description:迭代所有节点的data
    *@Date:16:49 2018/5/17
    */
    public void printList() {
        Node tmp = head;
        while (tmp != null) {
            System.out.println(tmp.data);
            tmp = tmp.next;
        }
    }


}
