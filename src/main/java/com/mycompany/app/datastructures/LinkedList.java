package com.mycompany.app.datastructures;
public class LinkedList {

    private class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    private Node head;
    int nodeCount = 0;

    public void addFront(int data) {
        Node newNode = new Node(data);
        newNode.next = head; // Set newNode's next to the current head
        head = newNode;      // Update head to newNode
        nodeCount++;
    }
    public void addBack(int data) {
        Node newNode = new Node(data);
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
        nodeCount++;
    }
    public int getFirstNode() {
        if (head == null) {
            throw new IllegalStateException("Empty List");
        }
        return head.data;
    }

    public int getLastNode() {
        if (head == null) {
            throw new IllegalStateException("Empty List");
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        return current.data;
    }
    public int size(){
        return nodeCount;
    }
    public void clear(){
        head = null;
        nodeCount = 0;
    }
    public void deleteValue(int data){
        if (head == null) {
            throw new IllegalStateException("Empty List");
        }
        if(head.data == data) {
            head = head.next;
            nodeCount -=1;
        }
        Node current = head;
        while (current.next != null) {
            if(current.next.data == data){
                current.next = current.next.next;
                nodeCount -=1;
            }
            else{
                current = current.next;
            }

        }
    }
}