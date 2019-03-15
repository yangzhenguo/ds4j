package com.hiyzg.ds4j.demoset1.util;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Sam on 2019/3/14.
 */
public class MyArrayTest {
    @Test
    public void size() throws Exception {
        assertEquals(0, new MyArray().size());
    }

    @Test
    public void add() throws Exception {
        MyArray myArray = new MyArray();
        myArray.add(12);
        assertEquals(1, myArray.size());
    }

    @Test
    public void get() throws Exception {
        MyArray array = new MyArray();
        array.add(1);
        assertEquals(1, array.get(0));
    }

    @Test
    public void delete() throws Exception {
        MyArray array = new MyArray();
        array.add(1);
        array.add(2);
        int delete = array.delete(1);
        assertEquals(2, delete);
    }

    @Test
    public void lineSearch() throws Exception {
        MyArray array = new MyArray();
        array.add(3);
        array.add(2);
        array.add(6);
        array.add(4);
        array.add(1);
        assertEquals(3, array.lineSearch(4));
    }

    @Test
    public void binarySearch() throws Exception {
        MyArray array = new MyArray();
        array.add(1);
        array.add(3);
        array.add(6);
        array.add(8);
        array.add(9);
        int i = array.binarySearch(7);
        assertEquals(-1, i);
    }

    @Test
    public void set() throws Exception {
        MyArray array = new MyArray();
        array.add(1);
        array.add(2);
        array.set(1, 3);
        assertEquals(3, array.get(1));
    }
}
