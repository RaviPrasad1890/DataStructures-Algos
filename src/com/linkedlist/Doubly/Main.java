package com.linkedlist.Doubly;

public class Main {
    public static void main(String[] args){
        //Create empty DoublyLinkedLIst
        DoubleLinkedList list= new DoubleLinkedList();
        //Initialize
        list.createDoubleLinkedList(11);
        System.out.println("Size of list: "+list.sizeOfList());
        System.out.println("Forward Traversal");
        list.traverseListForward();
        System.out.println("Backward Traversal");
        list.traverseListForward();

        list.insertNextElement(12);
        list.insertNextElement(13);
        list.insertNextElement(14);
        list.insertNextElement(15);
        list.insertNextElement(16);
        list.insertNextElement(17);
        list.insertNextElement(18);
        list.insertNextElement(19);
        System.out.println("Size of list: "+list.sizeOfList());
        System.out.println("Forward Traversal");
        list.traverseListForward();
        System.out.println("Backward Traversal");
        list.traverseListBackward();


    }
}
