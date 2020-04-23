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
        System.out.println("Insert 3 at 3rd Index, Index starting from 0");
        list.insertElementAtGivenPosition(3,3);
        list.traverseListForward();
        System.out.println("Insert 1 at 0th Index, Index starting from 0");
        list.insertElementAtGivenPosition(1,0);
        list.traverseListForward();
        System.out.println("Insert 21 at last");
        list.insertElementAtGivenPosition(21,11);
        list.traverseListForward();
        System.out.println("Insert 20 at 2nd last");
        list.insertElementAtGivenPosition(20,11);
        list.traverseListForward();
    }
}
