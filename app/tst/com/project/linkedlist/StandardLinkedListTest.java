package com.project.linkedlist;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;

public class StandardLinkedListTest {
    static LLinkedList list;


<<<<<<< HEAD
    @BeforeAll
    static void setup() {
        list = new StandardLinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
=======
    @BeforeEach
    void setup() {
>>>>>>> 886101cadba35e922b82f96f38a23c3006b8fbde
    }

    @Test
    void addTest() {
    }

    @Test
    void removeTest() {
    }

    @Test
    void getTest() {
    }
}
