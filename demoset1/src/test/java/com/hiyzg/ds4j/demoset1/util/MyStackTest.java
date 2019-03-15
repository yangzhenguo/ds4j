package com.hiyzg.ds4j.demoset1.util;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by Sam on 2019/3/15.
 */
public class MyStackTest {
    @Test
    public void pop() throws Exception {
        MyStack stack = new MyStack();
        stack.push(1);
        stack.push(3);
        stack.push(5);
        assertEquals(5, stack.pop());
    }

    @Test(expected = RuntimeException.class)
    public void pop2() throws Exception {
        MyStack stack = new MyStack();
        stack.pop();
    }

    @Test
    public void peek() throws Exception {
        MyStack stack = new MyStack();
        stack.push(23);
        assertEquals(23, stack.peek());
    }

    @Test(expected = RuntimeException.class)
    public void peek2() throws Exception {
        MyStack stack = new MyStack();
        stack.peek();
    }

    @Test
    public void isEmpty() throws Exception {
        MyStack stack = new MyStack();
        assertTrue(stack.isEmpty());
    }
}