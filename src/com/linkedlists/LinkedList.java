package com.linkedlists;

public class LinkedList {
    Node head;
    static int size=0;

    /* Adding Data at the end */
    public void addData(int data){
        Node node = new Node();
        node.data = data;
        node.next = null;
        size++;

        if(head == null){
            head = node;
        }
        else{
            Node tempNode = head;
            while(tempNode.next != null){
                tempNode=tempNode.next;
            }
            tempNode.next=node;
        }
    }

    /* Adding data at the beginning */
    public void addFirst(int data){
        Node node = new Node();
        node.data = data;
        node.next = null;
        size++;

        if(head == null){
            head = node;
        }
        else{
            node.next = head;
            head=node;
        }
    }

    public void append(int data){
        addData(data);
    }

    /* Adding at a position */
    public void addAfter(int prevData, int newData){
        Node tempNode = head;
        Node newNode = new Node();
        newNode.data = newData;
        newNode.next = null;
        while(tempNode.data != prevData){
            tempNode=tempNode.next;
        }
        newNode.next = tempNode.next;
        tempNode.next=newNode;
    }

    /* Deleting first node */
    public void deleteFirst(){
        if(head == null){
            System.out.println("Linked List is empty");
        }
        head = head.next;
    }

    /* Deleting last node */
    public void deleteLast(){
        if(head == null){
            System.out.println("Linked List is empty");
        }
        if(head.next == null){
            head = null;
        }
        Node tempNode1 = head;
        Node tempNode2 = head.next;

         while(tempNode2.next != null){
             tempNode1 = tempNode1.next;
             tempNode2 = tempNode2.next;
         }
         tempNode1.next = null;
    }

    /* Searching for a node */
    public void search(int data){
        Node tempNode = head;
        int position = 0;
        while(tempNode.next != null){
            position++;
            if(tempNode.data == data){
                System.out.println( " Position of " + data + " is " + position);
                break;
            }
            else{
                tempNode = tempNode.next;
            }
        }
    }

    /* Displaying Linkedlist */
    public void display(){
        Node tempNode = head;
        while (tempNode != null){
            System.out.print(tempNode.data + " -> ");
            tempNode=tempNode.next;
        }
        System.out.println("NULL");
    }

}
