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
        assertEquals(list.get(1), 1);
    }

    @Test
    void removeAndGetTest() throws Exception {
    }
}
