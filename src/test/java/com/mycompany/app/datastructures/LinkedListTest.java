package com.mycompany.app.datastructures;

import com.mycompany.app.datastructures.LinkedList.LinkedList;
import org.junit.Assert;
import org.junit.Test;

public class LinkedListTest {
    private LinkedList linkedList = new LinkedList();
    @Test
    public void addFront() {
        linkedList.addFront(5);
        linkedList.addFront(31);
    }

    @Test
    public void getFistNode() {
        linkedList.addFront(5);
        linkedList.addFront(31);
        Assert.assertEquals(31,linkedList.getFirstNode());
    }
    @Test
    public void getLastNode() {
        linkedList.addFront(10);
        linkedList.addFront(31);
        linkedList.addFront(48);
        Assert.assertEquals(10,linkedList.getLastNode());
    }


    @Test
    public void addBack() {
        linkedList.addFront(10);
        linkedList.addFront(31);
        linkedList.addFront(48);
        linkedList.addBack(52);
        Assert.assertEquals(52,linkedList.getLastNode());
    }

    @Test
    public void size() {
        Assert.assertEquals(0,linkedList.size());
        linkedList.addFront(10);
        linkedList.addFront(31);
        Assert.assertEquals(2,linkedList.size());
        linkedList.addFront(48);
        Assert.assertEquals(3,linkedList.size());
        linkedList.addBack(52);
        Assert.assertEquals(4,linkedList.size());
    }

    @Test
    public void clear() {
        linkedList.addFront(10);
        linkedList.addFront(31);
        linkedList.addFront(48);
        linkedList.addBack(52);
        Assert.assertEquals(4,linkedList.size());
        linkedList.clear();
        Assert.assertEquals(0,linkedList.size());
    }
    @Test
    public void deleteValue() {
        linkedList.addFront(10);
        linkedList.addFront(31);
        linkedList.addFront(48);
        linkedList.addFront(52);
        Assert.assertEquals(4,linkedList.size());
        linkedList.deleteValue(48);
        Assert.assertEquals(3,linkedList.size());
        //Assert.assertEquals(31,linkedList.getLastNode());
    }
}