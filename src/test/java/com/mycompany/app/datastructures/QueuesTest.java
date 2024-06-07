package com.mycompany.app.datastructures;

import com.mycompany.app.datastructures.Queues.Queues;
import org.junit.Assert;
import org.junit.Test;

public class QueuesTest {
    private Queues queues = new Queues();
    @Test
    //Items are added at the end of the queue
    public void addToQueue() {
        queues.addToQueue(50);
        queues.addToQueue(80);
        queues.addToQueue(120);
        Assert.assertEquals(50,queues.getHead());
        Assert.assertEquals(120,queues.getTail());
    }
    @Test
    //Items are removed at the front of the queue
    public void removeFromQueue() {
        queues.addToQueue(50);
        queues.addToQueue(80);
        queues.addToQueue(120);
//        Assert.assertEquals(50,queues.getHead());
//        Assert.assertEquals(120,queues.getTail());
        Assert.assertEquals(50,queues.removeFromQueue());
    }

}