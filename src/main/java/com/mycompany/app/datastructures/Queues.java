package com.mycompany.app.datastructures;

public class Queues {
    private class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }
    private Node head;
    private Node tail;

    public void addToQueue(int data){
        Node newNode = new Node(data);
        tail.next = newNode;
        if(head == null)
            head = newNode;
    }
}
