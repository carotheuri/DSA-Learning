package com.mycompany.app.datastructures;

import com.mycompany.app.datastructures.Trees.BinaryTree;
import org.junit.Assert;
import org.junit.Test;

public class BinaryTreeTest {
    private BinaryTree binaryTree = new BinaryTree();

    @Test
    public void insert() {
        binaryTree.insert(5);
        binaryTree.insert(3);
        binaryTree.insert(2);
        binaryTree.insert(4);
        binaryTree.insert(7);
        binaryTree.insert(6);
        binaryTree.insert(8);
        Assert.assertEquals(2,binaryTree.getTreeHeight());
    }
}