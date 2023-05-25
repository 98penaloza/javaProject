package com.project.queue;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.BeforeEach;

public class StandardQueueTest {
    static Queue<Integer> queue;

    @BeforeEach
    void setup() {
        queue = new StandardQueue<>();
    }

    @Test
    void testQueue() throws Exception {
        assertDoesNotThrow(() -> queue.add(1));
        assertEquals(queue.get(), 1);

        queue.add(5);
        assertEquals(queue.get(), 1);

        queue = new StandardQueue<>();
        queue.add(1);
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(5);
        assertEquals(queue.getLength(), 5);

        for (int i = 0; i < 3; i++) {
            assertDoesNotThrow(() -> queue.pop());
        }

        assertEquals(queue.getLength(), 2);
        assertEquals(queue.get(), 3);
    }

    @Test
    void testThrows() {
        queue.add(8);
        queue.add(13);
        assertEquals(queue.getLength(), 2);
        assertDoesNotThrow(() -> queue.pop());
        assertDoesNotThrow(() -> queue.pop());
        assertEquals(queue.getLength(), 0);
        assertThrows(Exception.class, () -> queue.pop());
        assertThrows(Exception.class, () -> queue.get());
        
        queue.add(21);
        assertDoesNotThrow( () -> queue.get());
        assertDoesNotThrow(() -> queue.pop());
    }
}