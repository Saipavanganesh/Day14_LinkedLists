package com.linkedlists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class LinkedList {
    Node head;
    static int size=0;

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

    /* Insert After */
    public void insertAfter(int prevData, int newData){
        addAfter(prevData,newData);
    }

    /* Delete node */
    public void delete(int data){
        Node temp1 = head;
        Node temp2 = head.next;
        while(temp2 != null){
            if(temp2.data == data){
                temp2 = temp2.next;
                temp1.next = temp2;
            }
            else{
                temp1 = temp1.next;
                temp2 = temp2.next;
            }
        }
    }

    /* Sorted Linked List */
    public void sortedLinkedList(){
        ArrayList<Integer> sortedList = new ArrayList<Integer>();
        Node temp = head;
        while(temp.next != null){
            sortedList.add(temp.data);
            temp = temp.next;
        }
        sortedList.add(temp.data);
        Collections.sort(sortedList);
        for( int i=0; i< sortedList.size(); i++){
            deleteFirst();
            addData(sortedList.get(i));
        }
        display();
    }



    /* Displaying size of Linked list */
    public void size(){
        int size = 1;
        Node temp = head;
        while(temp.next != null){
            size++;
            temp = temp.next;
        }
        System.out.println("Linked List size is " + size);
    }


    /* Displaying Linked list */
    public void display(){
        Node tempNode = head;
        while (tempNode != null){
            System.out.print(tempNode.data + " -> ");
            tempNode=tempNode.next;
        }
        System.out.println("NULL");
    }

}
