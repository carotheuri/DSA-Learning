package com.mycompany.app.datastructures.Trees;

public class BinaryTree {
    public BinaryTree() {

    }

    class Node{
        int data;
        int height;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
            this.height = 0;
        }
    }
    private Node root;
    public void insert(int data){
        root = insertItem(root,data);
    }
    public Node insertItem(Node node, int data){
        if(node == null)
            node = new Node(data);

        if(data < node.data)
            node.left = insertItem(node.left,data);
        else if (data > node.data) {
            node.right = insertItem(node.right,data);
        }
        node.height = 1 + Math.max(getHeight(node.left),getHeight(node.right));
        return node;
    }
    private int getHeight(Node node) {
        if (node == null) {
            return -1;  // Return -1 for null nodes, as leaf nodes have height 0
        }
        return node.height;
    }
    public int getTreeHeight() {
        return getHeight(root);
    }
}
