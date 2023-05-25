package com.project.linkedlist;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;

public class StandardLinkedListTest {
    LLinkedList list;


    @BeforeEach
    void setup() {
        list = new StandardLinkedList<>();
        
    }

    @Test
    void addTest() throws Exception {
        assertDoesNotThrow(() -> list.add(0));
        assertEquals(list.get(0), 0);

        list.add(1);
        assertEquals(list.get(1), 1);
        assertEquals(list.get(0), 0);


        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        assertEquals(list.getLength(), 6);
    }

    @Test
    void removeAndGetTest() throws Exception {
        list.add(0);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        assertDoesNotThrow(() -> list.remove(3));
        assertDoesNotThrow(() -> list.remove(4));
        assertDoesNotThrow(() -> list.remove(0));
        assertDoesNotThrow(() -> list.remove(3));

        assertThrows(Exception.class, () -> list.remove(3));

        assertEquals(list.get(0), 1);
        assertEquals(list.get(1), 2);

        assertEquals(list.getLength(), 2);
    }
}
