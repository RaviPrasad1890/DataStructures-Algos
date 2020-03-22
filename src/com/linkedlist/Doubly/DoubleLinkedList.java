package com.linkedlist.Doubly;

public class DoubleLinkedList {
    private DoublyNode head;
    private DoublyNode tail;

    public void createDoubleLinkedList(int data){
        DoublyNode node=new DoublyNode(data);
        head=node;
        head.previous=null;
        head.next=null;
        tail=node;
        tail.previous=null;
        tail.next=null;
    }

    public void insertNextElement(int data){
        if(head==null){
            System.out.println("List doesn't exists");
        }else{
            DoublyNode node=new DoublyNode(data);
            node.previous=tail;
            tail.next=node;
            tail=node;
            tail.next=null;
        }
    }

    public int sizeOfList(){
        int size=0;
        if(head==null){
            return 0;
        }else{
            DoublyNode tempNode=head;
            while(tempNode!=null){
                size++;
                tempNode=tempNode.next;
            }
        }
        return size;
    }

    public void traverseListForward(){
        if(head==null){
            System.out.println("List Doesn't Exists");
        }else{
            DoublyNode tempNode=head;
            while(tempNode!=null){
                System.out.print(tempNode.data+" ");
                tempNode=tempNode.next;
            }
            System.out.println();
        }
        System.out.println("----------------------------------");
    }

    public void traverseListBackward(){
        if(tail==null){
            System.out.println("List Doesn't Exists");
        }else{
            DoublyNode tempNode=tail;
            while(tempNode!=null){
                System.out.print(tempNode.data+" ");
                tempNode=tempNode.previous;
            }
            System.out.println();
        }
        System.out.println("----------------------------------");
    }
}
