package com.project.linkedlist;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;

public class StandardDoubleLinkedListTest {
    LinkedList<Integer> list;


    @BeforeEach
    void setup() {
        list = new StandardDoubleLinkedList<>();
        
    }

    @Test
    void addTest() throws Exception {
        assertDoesNotThrow(() -> list.add(9));
        assertEquals(list.get(0), 9);

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);
        list.add(11);
        list.add(12);
        list.add(13);

        assertEquals(13, list.get(13));
        assertEquals(11, list.get(11));
        assertEquals(3, list.get(3));
        assertEquals(9, list.get(9));
        assertEquals(14, list.getLength());
    }

    @Test
    void removeAndGetTest() throws Exception {
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        assertDoesNotThrow(() -> list.remove(5));

        assertEquals(5, list.get(4));
        assertEquals(6, list.getLength());
        assertDoesNotThrow(() -> list.remove(0));
        assertEquals(5, list.getLength());

        assertDoesNotThrow(() -> list.remove(2));
        assertEquals(4, list.getLength());
        assertEquals(3, list.get(1));
        assertEquals(5, list.get(2));
        
        assertEquals(3, list.get(1));
        assertThrows(Exception.class, () -> list.remove(22));
        assertThrows(Exception.class, () -> list.remove(-22));
    }
}
