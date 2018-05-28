package dataStructure.singleLinkedList;

public class main {
    public static void main(String[] args){
        SingleLinkedList singleLinkedList = new SingleLinkedList();
        for(int i=0;i<10;i++){
            singleLinkedList.addNode(i);
        }
        singleLinkedList.deleteNode(0);
        singleLinkedList.deleteNode(9);
        singleLinkedList.printList();
    }
}
