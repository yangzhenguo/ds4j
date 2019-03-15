package com.hiyzg.ds4j.demoset1.util;

/**
 * Created by Sam on 2019/3/15.
 */
public class MyStack {
    private int[] elements;

    public MyStack() {
        this.elements = new int[0];
    }

    public void push(int target) {
        int[] newElements = new int[this.elements.length + 1];
        for (int i = 0; i < this.elements.length; i++) {
            newElements[i] = this.elements[i];
        }
        newElements[this.elements.length] = target;
        this.elements = newElements;
    }

    public int pop() {
        int target = this.elements[this.elements.length - 1];
        int[] newElements = new int[this.elements.length - 1];
        for (int i = 0; i < newElements.length; i++) {
            newElements[i] = this.elements[i];
        }
        this.elements = newElements;
        return target;
    }
}
