package com.hiyzg.ds4j.demoset1.util;

/**
 * Created by Sam on 2019/3/14.
 */
public class MyArray {
    private int[] elements;

    public MyArray() {
        this.elements = new int[0];
    }

    public int size() {
        return elements.length;
    }

    public void add(int element) {
        int[] newElements = new int[this.size() + 1];
        for (int i = 0; i < elements.length; i++) {
            newElements[i] = elements[i];
        }
        newElements[elements.length] = element;
        this.elements = newElements;
    }

    public int get(int i) {
        return this.elements[i];
    }

    public int delete(int index) {
        if (index < 0 || index >= this.elements.length) {
            throw new ArrayIndexOutOfBoundsException("下标越界");
        }
        int[] newElements = new int[this.size() - 1];
        for (int i = 0; i < newElements.length; i++) {
            newElements[i] = this.elements[index >= i ? i + 1 : i];
        }
        int deleted = this.elements[index];
        this.elements = newElements;
        return deleted;
    }

    public int lineSearch(int target) {
        int index = -1;
        for (int i = 0; i < this.elements.length; i++) {
            if (this.elements[i] == target) {
                index = i;
                break;
            }
        }
        return index;
    }

    public int binarySearch(int target) {
        int start = 0, end = this.elements.length - 1, middle = (start + end) / 2;
        do {
            if (target == this.elements[middle]) {
                return middle;
            } else if (target < this.elements[middle]) {
                end = middle - 1;
            } else {
                start = middle + 1;
            }
            middle = (start + end) / 2;
        } while (start < end);
        return -1;
    }

    public int set(int i, int element) {
        return this.elements[i] = element;
    }
}
