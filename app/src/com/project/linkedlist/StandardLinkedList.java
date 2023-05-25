package com.project.linkedlist;

import com.project.node.Node;
import com.project.node.StandardNode;

import lombok.Getter;

public class StandardLinkedList<T> implements LLinkedList<T> {

    private Node<T> head = null;

    @Getter
    private int length = 0;

    public StandardLinkedList() {
        head = null;
    }

    public void add(T value) {
        Node<T> newNode = new StandardNode<>(value);
        if (head == null) {
            head = newNode;
            length = 1;
        } else {
            // current node
            Node<T> current = head;

            // go through all of em
            while (current.getNext() != null) {
                current = current.getNext();
            }
            
            // set next node
            current.setNext(newNode);
            length += 1;
        }
    }

    public void remove(int indx) {
        // head-indx0 -> n1-indx1 -> n2-indx2 -> ...
        // after remove indx1
        // // head-indx0 -> n2-indx1 -> ...
        if (indx > length) {
            return;
        } else if (indx == 0) {
            head = head.getNext();
            length -= 1;
        } else {
            length -= 1;
            Node<T> current = head;
            Node<T> prev = null;
            int count = 0;
            
            while (current != null & count < indx) {
                prev = current;
                current = current.getNext();
                count += 1;
            }

            if (current != null) {
                prev.setNext(current.getNext());
            }
        }  
    }

    public T get(int indx) throws Exception {
        if (indx >= length){
            throw new Exception("Index out of bound");
        }

        Node<T> current = head;
        int count = 0;

        while (current != null && count < indx) {
            current = current.getNext();
            count += 1;
        }

        return current.getValue();
    }
}
