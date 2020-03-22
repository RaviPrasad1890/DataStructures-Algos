package com.linkedlist.single;

public class SingleLinkedList {

    private Node head;
    private Node tail;

    public Node createLinkedList(int data){
        //Create a Linked List with one element

        head= new Node(data);
        head.next=null;
        tail=head;
        return head;
   }

   public boolean addNextElement(int data){
        boolean isAdded=false;
       if (head == null) {
           //Linked List doesn't exists
           System.out.println("Linked List doesn't exists");
       }else{
           Node node=new Node(data);
           tail.next=node;
           tail=node;
           isAdded=true;
       }
        return isAdded;
   }

   public boolean insertElementAtGivenPostion(int data,int position){
        boolean isInserted=false;
        if(head==null){
            System.out.println("List doesn't exists");
            return isInserted;
        }

        Node nodeToBeInserted=new Node(data);
        int size=sizeOfLinkedList();
       if(position>size){
           System.out.println("Index out of bound");
       }else if(position==0){
           //Case 1: Insert at 0th Position, i.e. at head
           nodeToBeInserted.next=head;
           head=nodeToBeInserted;
           isInserted=true;
       }else if(position==size){
           //Case 2: Insert at last of linked list
           tail.next=nodeToBeInserted;
           tail=nodeToBeInserted;
           isInserted=true;
       }else{
           //Case 3: In between
           Node tempHead=head;
           int counter=0;

           while(tempHead!=null){
               counter++;
               if(position==counter){
                   nodeToBeInserted.next=tempHead.next;
                   tempHead.next=nodeToBeInserted;
                   isInserted=true;
                   break;
               }
               tempHead=tempHead.next;
           }
       }
        return isInserted;
   }

   public boolean deleteElementFromLinkedList(int location){
        boolean isDeleted=false;
        int size=sizeOfLinkedList();
        if(head==null){
            System.out.println("Linked List doesn't exists");
            return isDeleted;
        }else if(location<0||location>=size){
            System.out.println("Index out of bound");
            return isDeleted;
        }else if(location==0){
            //Case 1: Delete first element
                if (size == 1) {
                    head=tail=null;
                }else {
                    head = head.next;
                }

                isDeleted=true;
        }else {
            Node tempHead=head;
            int counter=0;
            while(tempHead!=null){
                counter++;
                if(location==counter){
                    if(location==size-1){
                        //Update tail
                        tail=tempHead;
                    }
                    tempHead.next=tempHead.next.next;
                    isDeleted=true;
                    break;
                }
                tempHead=tempHead.next;
            }
        }

        return isDeleted;
   }

   public int searchNode(int nodeValue){
      int location=-1;

      Node tempNode=head;
      int index=0;
      while(tempNode!=null){
          if(nodeValue==tempNode.data){
              location=index;
              break;
          }
          index++;
          tempNode=tempNode.next;
      }

      return location;
   }
    public int sizeOfLinkedList(){
       int size=0;
       Node tempHead=head;
       while(tempHead!=null){
           size++;
           tempHead=tempHead.next;
       }
       return size;
    }

    public void traverseLinkedList(){
       Node tempHead=head;
       while(tempHead!=null){
           System.out.print(tempHead.data+" ");
           tempHead=tempHead.next;
       }
        System.out.println();
        System.out.println("--------");
    }

}
