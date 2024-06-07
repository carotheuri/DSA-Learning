package com.mycompany.app.datastructures.Queues;

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
        if(tail != null){
            tail.next = newNode;
        }
        tail = newNode;
        if(head == null){
            head = tail;
        }

    }
    public int getHead(){
        checkIfHeadExists();
        return head.data;
    }
    public int getTail(){
        checkIfHeadExists();
        return tail.data;
    }
    public int removeFromQueue(){
        int data = head.data;
        head = head.next;
        if(head == null){
            tail = null;
        }
        return data;
    }
    public int checkIfHeadExists(){
        if(head == null)
            throw new IllegalStateException("Empty List");
        return head.data;
    }
}
