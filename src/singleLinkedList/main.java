package singleLinkedList;

public class main {
    public static void main(String[] args){
        LinkList linkList = new LinkList();
        for(int i=0;i<10;i++){
            linkList.addNode(i);
        }
        linkList.printList();
    }
}
