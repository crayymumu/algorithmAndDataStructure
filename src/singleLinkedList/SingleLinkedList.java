package singleLinkedList;

public class SingleLinkedList {
    public Node head;               // 头节点
    public Node rear;                // 尾节点
    private Node point;              //临时引用节点
    public int length;     //记录节点的长度

    public SingleLinkedList() { //构造函数用来初始化

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
            rear = head;//链表当前只有一个节点，所以首尾不分家
            ++length;//链表的当前长度为1
            return;
        }
        rear.next = point;//尾节点指向临时节点
        rear = point;//因为新增了一个节点，所以尾节点也需要替换
        ++length;
    }

    /**
    *@param:
    *@Description:从链表中删除指定数值的节点,从头结点进行遍历
    *@Date:10:38 2018/5/24
    */
    public void deleteNode(Object d){
        if(head.data == d){ //单独考虑头节点的情况
            Node tem3 = head.next;//获取要删除节点的下一个节点并赋值给临时节点
            head.next = tem3.next;
            head.data = tem3.data;//将临时节点的各项值覆盖掉给要删除的节点
            tem3.next = null;//再将该节点与后续节点断开
            return;
        }
        point = head;//将临时节点指向头结点
        Node tem1 = new Node();
        while(!point.data.equals(d)){
            tem1 = point;//用来专门应对删除尾节点
            if(point.next==null){ //若遍历结束还未找到该值，此步骤会出现节点值的下一个节点为空，结束循环并返回
                return;
            }
            point = point.next;
        }
        if(point.equals(rear)){ //单独考虑尾节点的情况
            tem1.next=null;
            rear = tem1;
            return;
        }
        Node tem2 = point.next;//获取要删除节点的下一个节点并赋值给临时节点
        point.next = tem2.next;
        point.data = tem2.data;//将临时节点的各项值覆盖掉给要删除的节点
        tem2.next = null;//再将该节点与后续节点断开
        --length;
    }

    /**
    *@param:
    *@Description:迭代所有节点的data
    *@Date:16:49 2018/5/17
    */
    public void printList() {
        point = head;
        while (point != null) {
            System.out.println(point.data);
            point = point.next;
        }
    }


}
