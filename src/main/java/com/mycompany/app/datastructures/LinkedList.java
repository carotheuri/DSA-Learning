package com.mycompany.app.datastructures;

public class LinkedList{

    private static class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }
    public Node head;
    public void addFront(int data){
        Node newNode = new Node(data);
        if(head == null)
            head = newNode;
            return;
        newNode.next = head;
        head = newNode;
    }

}