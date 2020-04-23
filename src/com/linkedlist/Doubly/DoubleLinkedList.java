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

    public void insertElementAtGivenPosition(int data,int position){
        if(head==null){
            System.out.println("List doesn't exists");
        }else{
            DoublyNode node=new DoublyNode(data);
            //Case 1:Insert at Beginning,i.e. 0th Position
            if(position==0){
                node.next=head;
                node.previous=null;
                head=node;
            }else if(position==sizeOfList()){
                //Case 2: Insert at last
                insertNextElement(data);
            }else{
                int counter=0;
                DoublyNode currentNode = head;
                while(currentNode.next!=null){
                    counter++;
                    if(counter==position){
                        //We need to insert new node after current node
                        node.previous=currentNode;
                        node.next=currentNode.next;
                        currentNode.next.previous=node;
                        currentNode.next=node;
                        break;
                    }
                    currentNode=currentNode.next;
                }
            }
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
