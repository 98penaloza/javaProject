package com.project.queue;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;

public class StandardQueueTest {
    static Queue<Integer> queue;

    @BeforeAll
    static void setup() {
        queue = new StandardQueue<>();
        queue.add(1);
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(5);
    }

    @Test
    void testAdd() {
        queue = new StandardQueue<>();
        queue.add(1);


    }

    @Test
    void testGetLength() {

    }

    @Test
    void testGet() {

    }

    @Test
    void testGetThrows() {

    }

    @Test
    void testPop() {

    }

    @Test
    void testPopThrows() {

    }
}