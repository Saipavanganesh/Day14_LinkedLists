package com.linkedlists;

public class LinkedList {
    Node head;


    /* Adding Data at the end */
    public void addData(int data){
        Node node = new Node();
        node.data = data;
        node.next = null;

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

        if(head == null){
            head = node;
        }
        else{
            node.next = head;
            head=node;
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
