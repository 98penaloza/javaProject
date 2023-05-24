package com.project.linkedlist;

import com.project.node.Node;
import com.project.node.StandardNode;

public class StandardLinkedList<T> implements LinkedList<T> {

    private Node<T> head = null;
    private int size = 0;

    StandardLinkedList() {
        head = null;
    }

    public void add(T value) {
        Node<T> newNode = new StandardNode<>(value);
        if (head != null) {
            head = newNode;
            size = 1;
        } else {
            size += 1;
            // implement

        }
    }

    public void remove(int indx) {
        // head-indx0 -> n1-indx1 -> n2-indx2 -> ...
        // after remove indx1
        // // head-indx0 -> n2-indx1 -> ...
        size -= 1;
    }

    public T get(int indx) throws Exception {
        if (indx >= size) {
            throw new Exception("Index out of bound");
        }
        for (int i = 0; i <= indx; i++) {
            // implement
        }
        return null;
    }

    @Override
    public T getLength() {
        // Use decorator for getter and rename internal attribute to track size
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getLength'");
    }
}
