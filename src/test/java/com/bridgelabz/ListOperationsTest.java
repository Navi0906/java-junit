package com.bridgelabz;

import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class ListOperationsTest {

    @Test
    public void fiveInList(){
        List<Integer> list = new ArrayList<>();
        ListManager li = new ListManager();
        assertTrue(li.addElement(list,5));
    }

    @Test
    public void twoInList(){
        List<Integer> list = new ArrayList<>();
        ListManager li = new ListManager();
        assertTrue(li.addElement(list,2));
    }

    @Test
    public void twoOutList(){
        List<Integer> list = new ArrayList<>();
        list.add(2);
        ListManager li = new ListManager();
        assertFalse(li.removeElement(list,2));
    }

    @Test
    public void fiveOutList(){
        List<Integer> list = new ArrayList<>();
        list.add(5);
        ListManager li = new ListManager();
        assertFalse(li.removeElement(list,5));
    }


    @Test
    public void sizeList(){
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(5);
        ListManager li = new ListManager();
        assertEquals(2,li.getSize(list));
    }

}
