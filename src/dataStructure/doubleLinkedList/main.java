package dataStructure.doubleLinkedList;


public class main {
    public static void main(String[] args){
        DoubleLinkedList doubleLinkedList = new DoubleLinkedList();
        for(int i=0;i<10;i++){
            doubleLinkedList.addNode(i);
        }
        DoubleLinkedList doubleLinkedList2 =doubleLinkedList.deepClone();
        doubleLinkedList2.flipLinkedList();
//        System.out.println(doubleLinkedList2.head.data);
//        System.out.println(doubleLinkedList2.head.next.data);
//        System.out.println(doubleLinkedList2.head.next.next.data);
//        System.out.println(doubleLinkedList2.head.next.next.next.data);
        doubleLinkedList.printList();
        doubleLinkedList2.printList();
    }
}
