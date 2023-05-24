package com.project.node;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;

public class StandardNodeTest {
    static Node node1;
    static Node node2;
    static Node node3;
    static Node node4;

    @BeforeEach
    void setup() {
        node1 = StandardNode.builder().value(1).next(null).build();
        node2 = StandardNode.builder().value(2).next(node1).build();
        node3 = StandardNode.builder().value(3).next(node2).build();
        node4 = StandardNode.builder().value(4).next(node3).build();

    }

    @Test
    void testGetters() {
        assertEquals(node1.getNext(), null);
        assertEquals(node2.getNext(), node1);
        assertEquals(node3.getNext().getNext(), node1);
        assertEquals(node4.getNext().getNext(), node3.getNext());

        assertEquals(node1.getValue(), node2.getNext().getValue());
        assertEquals(node2.getNext().getValue(), node3.getNext().getNext().getValue());
    }

    @Test
    void testSetters() {
        assertEquals(node1.getValue(), 1);
        node1.setValue(0);
        assertEquals(node1.getValue(), 0);

        assertEquals(node2.getNext(), node1);
        assertEquals(node2.getNext().getValue(), 0);
        node2.setNext(node3);
        assertEquals(node2.getNext(), node3);
        assertEquals(node2.getNext().getValue(), node3.getValue());
    }
}
