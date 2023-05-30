package com.project.linkedlist;

import com.project.node.BidirectionalNode;
import com.project.node.StandardBidirectionalNode;

import lombok.Getter;

public class StandardDoubleLinkedList<T> implements LinkedList<T> {
    private BidirectionalNode<T> head = null;

    @Getter
    private int length = 0;

    public StandardDoubleLinkedList() {
        head = null;
    }

    @Override
    public void add(T value) {
        
        BidirectionalNode<T> newNode = new StandardBidirectionalNode<>(value);
        if (head == null) {
            head = newNode;
            length = 1;
        } else {
            // current node
            BidirectionalNode<T> current = head;
            BidirectionalNode<T> prev = null;

            // go through all of em
            while (current.getNext() != null) {
                prev = current;
                current = (BidirectionalNode<T>) current.getNext();
            }
            
            // TODO: ask whats up lol
            // set next node
            current.setPrev(prev);
            current.setNext(newNode);
            length += 1;
        }
    }

    @Override
    public T get(int indx) throws Exception {
        // TODO Auto-generated method stub
        if (indx >= length){
            throw new Exception("Index out of bound");
        }

        BidirectionalNode<T> current = head;
        int count = 0;

        while (current != null && count < indx) {
            current = (BidirectionalNode<T>) current.getNext();
            count += 1;
        }

        return current.getValue();
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

    @Override
    public void remove(int indx) throws Exception {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'remove'");
    }

}
