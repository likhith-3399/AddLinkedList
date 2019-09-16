package com.coding;

import org.junit.Before;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;

@RunWith(JUnit4.class)
public class AddTwoLinkedListsTest {

    private LinkedList linkedList;


    @Before
    public void setUp() {
       linkedList = new LinkedList();
    }

    @Test
    public void addTwoLists() {
        assertEquals(45801, linkedList.addLists(123, 45678).intValue());
    }

    @Test
    public void addTwoListsWithZero() {
        assertEquals(123, linkedList.addLists(123, 0).intValue());
    }

    @Test(expected = RuntimeException.class)
    public void addTwoListsWithException() {
        linkedList.addLists(123, -1);
    }

}
