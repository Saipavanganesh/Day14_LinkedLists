package com.linkedlists;

public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome to Linked Lists");
        System.out.println("***********************");
        System.out.println();
        LinkedList ll = new LinkedList();
        ll.addData(56);
        ll.addData(30);
        ll.addData(70);
        ll.display();
        ll.search(30);
    }
}
