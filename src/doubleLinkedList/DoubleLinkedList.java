package doubleLinkedList;



public class DoubleLinkedList{
    public Node head;               // 头节点
    public Node rear;                // 尾节点
    private Node point;              //临时引用节点
    public int length;     //记录节点的长度

    /**
    *@param:
    *@Description:链表复制
    *@Date:16:49 2018/5/24
    */
    public DoubleLinkedList deepClone() {
        DoubleLinkedList doubleLinkedList = new DoubleLinkedList();
        Node tem = this.head;
        while (tem.next!=null){
            doubleLinkedList.addNode(tem.data);
            tem = tem.next;
        }
        doubleLinkedList.addNode(tem.data);//切莫遗漏尾节点
        return doubleLinkedList;
    }
    /**
    *@param:
    *@Description:向链表中插入节点
    *@Date:11:13 2018/5/24
    */
    public void addNode(Object d) {
        point = new Node(d);
        if(d == null){
            return;
        }
        if(head == null){
            head = point;
            rear = head;
            ++length;//链表的当前长度为1
            return;
        }
        rear.next = point;//尾节点的下一个节点指向要插入的节点
        point.before = rear;//要插入的节点的上一个节点指向尾节点
        rear= point;//重新定义尾节点
        ++length;
    }

    /**
    *@param:
    *@Description:定位到从头遍历到的第一个指定节点值的节点
    *@Date:11:31 2018/5/24
    */
    public Node index(Object d){
        point = head;
        if(d == null){
            return null;
        }
        while(!point.data.equals(d)){
            if(point.next == null){
                return null;
            }
            point = point.next;
        }
        return point;
    }

    /**
    *@param:
    *@Description:删除从头遍历到的第一个指定节点值的节点
    *@Date:11:31 2018/5/24
    */
    public void deleteNode(Object d){
        point = index(d);
        if(point == null){
            return;
        }
        if(point.equals(head)){ //若要删除的节点为头结点
            head = head.next;
            point.next.before =null;
            point.next = null;
            return;
        }
        if(point.equals(rear)){ //若要删除的节点为尾节点
            rear = rear.before;
            point.before.next=null;
            point.before = null;
            return;
        }
        point.before.next = point.next;//将要删除的节点之前的节点的下一个节点指向要删除的节点之后的节点
        point.next.before = point.before;//将要删除的节点之后的节点指向要删除的节点之前的节点
        --length;
    }

    /**
    *@param:
    *@Description:翻转链表
    *@Date:13:14 2018/5/24
    */
    public DoubleLinkedList flipLinkedList(){
        Node flipHead = null;
        point = this.rear;
        Node tem;
        while(point.before!=null){ //每进行一次循环都会将point指代的链表进行翻转
            tem = point.next;
            point.next = point.before;
            point.before = tem;
            if(point.before==null){ //当发现翻转前的尾节点时，将其变成翻转后的头节点
                flipHead = point;
            }
            point= point.next;
        }
        tem = point.next;//当发现翻转前的头节点时，将其变成翻转后的尾节点
        point.next = point.before;
        point.before = tem;
        Node flipRear = point;
        this.head = flipHead;
        this.rear = flipRear;
        return this;
    }

    /**
    *@param:
    *@Description:迭代所有节点的值
    *@Date:11:23 2018/5/24
    */
    public void printList() {
        point = this.head;
        while (point != null) {
            System.out.println(point.data);
            point = point.next;
        }
    }
}
