package com.hiyzg.ds4j.demoset1.util;

/**
 * Created by Sam on 2019/3/14.
 */
public class MyArray<T> {
    private T[] elements;

    public MyArray() {
        this.elements = (T[])new Object[0];
    }

    public int size() {
        return elements.length;
    }

    public void add(T element) {
        T[] newElements = (T[])new Object[this.size() + 1];
        for (int i = 0; i < elements.length; i++) {
            newElements[i] = elements[i];
        }
        newElements[elements.length] = element;
        this.elements = newElements;
    }

    public T get(int i) {
        return this.elements[i];
    }

    public T delete(int index) {
        if (index < 0 || index >= this.elements.length) {
            throw new ArrayIndexOutOfBoundsException("下标越界");
        }
        T[] newElements = (T[])new Object[this.size() - 1];
        for (int i = 0; i < newElements.length; i++) {
            newElements[i] = this.elements[index >= i ? i + 1 : i];
        }
        T deleted = this.elements[index];
        this.elements = newElements;
        return deleted;
    }

    public T set(int i, T element) {
        return this.elements[i] = element;
    }
}
