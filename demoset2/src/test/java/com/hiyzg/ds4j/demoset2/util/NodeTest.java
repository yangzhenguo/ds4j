package com.hiyzg.ds4j.demoset2.util;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Sam on 2019/3/15.
 */
public class NodeTest {
    @Test
    public void append() throws Exception {
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);

        node1.append(node2);
        Node append = node1.append(node3);
        assertSame(append, node3);
    }

    @Test
    public void next() throws Exception {
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        node1.append(node2);

        assertSame(node1.next(), node2);
    }

    @Test
    public void getData() throws Exception {
        Node node = new Node(2);
        assertEquals(2, node.getData());
    }
}