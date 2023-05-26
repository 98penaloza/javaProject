package com.project.linkedlist;

import com.project.node.Node;
import com.project.node.StandardBidirectionalNode;

import lombok.Getter;

public class StandardDoubleLinkedList<T> implements LinkedList<T> {
    private Node<T> head = null;

    @Getter
    private int length = 0;

    public StandardDoubleLinkedList() {
        head = null;
    }

    @Override
    public void add(T value) {
        
        Node<T> newNode = new StandardBidirectionalNode<>(value);
        if (head == null) {
            head = newNode;
            length = 1;
        } else {
            // current node
            Node<T> current = head;
            Node<T> prev = null;

            // go through all of em
            while (current.getNext() != null) {
                prev = current;
                current = current.getNext();
            }
            
            // TODO: ask whats up lol
            // set next node
            //current.prev = prev;
            // current.setNext(newNode);
            length += 1;
        }
    }

    @Override
    public void remove(int indx) throws Exception {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'remove'");
    }

    @Override
    public T get(int indx) throws Exception {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'get'");
    }

    @Override
    public int getLength() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getLength'");
    }

    @Override
    public void insert(T value, int indx) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'insert'");
    }

}
