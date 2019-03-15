package com.hiyzg.ds4j.demoset2.util;

/**
 * Created by Sam on 2019/3/15.
 */
public class Node {
    private int data;

    private Node next;

    public Node(int data) {
        this.data = data;
    }

    public Node append(Node target) {
        Node last = this;
        while (last.next != null) {
            last = this.next;
        }
        last.next = target;
        return target;
    }

    public Node next() {
        return this.next;
    }

    public int getData() {
        return this.data;
    }
}
