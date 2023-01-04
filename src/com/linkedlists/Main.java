package com.linkedlists;

public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome to Linked Lists");
        System.out.println("***********************");
        System.out.println();
        LinkedList ll = new LinkedList();
        ll.addData(70);
        ll.addFirst(30);
        ll.addFirst(56);
        ll.display();
    }
}
