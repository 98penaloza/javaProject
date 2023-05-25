package com.project.linkedlist;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;

public class StandardLinkedListTest {
    static LLinkedList list;


    @BeforeAll
    static void setup() {
        list = new StandardLinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
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
