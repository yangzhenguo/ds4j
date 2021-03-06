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
        if (this.elements.length <= 0) {
            throw new RuntimeException("已经没有元素可以弹出了");
        }
        int target = this.elements[this.elements.length - 1];
        int[] newElements = new int[this.elements.length - 1];
        for (int i = 0; i < newElements.length; i++) {
            newElements[i] = this.elements[i];
        }
        this.elements = newElements;
        return target;
    }

    public int peek() {
        if (this.elements.length <= 0) {
            throw new RuntimeException("没有元素");
        }
        return this.elements[this.elements.length - 1];
    }

    public boolean isEmpty() {
        return this.elements.length <= 0;
    }
}
