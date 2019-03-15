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
        MyArray<Integer> array = new MyArray<>();
        array.add(1);
        assertEquals(new Integer(1), array.get(0));
    }

    @Test
    public void delete() throws Exception {
        MyArray<Integer> array = new MyArray<>();
        array.add(1);
        array.add(2);
        Integer delete = array.delete(1);
        System.out.println(delete);
    }

    @Test
    public void set() throws Exception {
        MyArray<Integer> array = new MyArray<>();
        array.add(1);
        array.add(2);
        array.set(1, 3);
        assertEquals(new Integer(3), array.get(1));
    }
}