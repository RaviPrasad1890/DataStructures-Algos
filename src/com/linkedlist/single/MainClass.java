package com.linkedlist.single;

public class MainClass {

    public static void main(String[] args){
        SingleLinkedList list=new SingleLinkedList();

        list.createLinkedList(10);
        System.out.println("Size of List: "+list.sizeOfLinkedList());
        list.traverseLinkedList();

        list.addNextElement(11);
        System.out.println("Size of List: "+list.sizeOfLinkedList());
        list.traverseLinkedList();

        list.addNextElement(12);
        System.out.println("Size of List: "+list.sizeOfLinkedList());
        list.traverseLinkedList();

        //Insert at first
        list.insertElementAtGivenPostion(3,0);
        System.out.println("Size of List: "+list.sizeOfLinkedList());
        list.traverseLinkedList();

        //Insert at last
        list.insertElementAtGivenPostion(5,4);
        System.out.println("Size of List: "+list.sizeOfLinkedList());
        list.traverseLinkedList();

        //Insert in between
        list.insertElementAtGivenPostion(6,2);
        System.out.println("Size of List: "+list.sizeOfLinkedList());
        list.traverseLinkedList();

        //Insert in between
        list.insertElementAtGivenPostion(7,4);
        System.out.println("Size of List: "+list.sizeOfLinkedList());
        list.traverseLinkedList();

        int index=list.searchNode(7);
        System.out.println(index);

        int index1=list.searchNode(3);
        System.out.println(index1);

        int index2=list.searchNode(5);
        System.out.println(index2);

        int index3=list.searchNode(99);
        System.out.println(index3);


        list.addNextElement(21);
        list.addNextElement(22);
        list.addNextElement(23);
        list.addNextElement(24);
        list.traverseLinkedList();
        System.out.println("Size of List: "+list.sizeOfLinkedList());

        System.out.println("---------------------------------------------------");
        list.deleteElementFromLinkedList(0);
        System.out.println("Size of List: "+list.sizeOfLinkedList());
        list.traverseLinkedList();

        System.out.println(list.deleteElementFromLinkedList(10));
        System.out.println("Size of List: "+list.sizeOfLinkedList());
        list.traverseLinkedList();

        list.deleteElementFromLinkedList(3);
        System.out.println("Size of List: "+list.sizeOfLinkedList());
        list.traverseLinkedList();

        list.deleteElementFromLinkedList(8);
        System.out.println("Size of List: "+list.sizeOfLinkedList());
        list.traverseLinkedList();

    }
}
