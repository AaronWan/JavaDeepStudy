package com.aita.collections;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author 万松(Aaron)
 * @since 5.7
 */
public class StackTest {
    @Test
    public void push() throws Exception {
        Stack stack = new Stack();
        stack.push("test");
        Assert.assertTrue(stack.size() == 1);
        Assert.assertEquals(stack.pop(), "test");
        Assert.assertTrue(stack.size() == 0);
        Assert.assertTrue(stack.isEmpty());

    }

    @Test
    public void iterator() throws Exception {
        Stack stack = new Stack();
        stack.push("test");
        stack.forEach(System.out::println);
    }

}