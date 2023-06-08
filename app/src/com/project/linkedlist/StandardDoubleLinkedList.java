package com.project.linkedlist;

import com.project.node.BidirectionalNode;
import com.project.node.StandardBidirectionalNode;

import lombok.Getter;

public class StandardDoubleLinkedList<T> implements LinkedList<T> {
    private BidirectionalNode<T> head = null;
    private BidirectionalNode<T> tail = null;

    @Getter
    private int length = 0;

    public StandardDoubleLinkedList() {
        head = null;
        tail = null;
    }

    @Override
    public void add(T value) {

        BidirectionalNode<T> newNode = new StandardBidirectionalNode<>(value);
        if (length == 0) {
            // set new tail, head = tail if length == 1
            head = newNode;
            tail = head;
            length = 1;
        } else {

            tail.setNext(newNode);
            newNode.setPrev(tail);
            tail = newNode;
            length += 1;
        }
    }

    @Override
    public T get(int indx) throws Exception {
        // TODO Auto-generated method stub
        if (indx >= length) {
            throw new Exception("Index out of bound");
        } else {
            int reverse_count;

            // decide where to start indexing (beginning/end)
            if (length / 2 >= indx) {
                BidirectionalNode<T> current = head;
                reverse_count = 0;

                while (current != null && reverse_count < indx) {
                    current = (BidirectionalNode<T>) current.getNext();
                    reverse_count += 1;
                }

                return current.getValue();
            } else {
                BidirectionalNode<T> current = tail;

                // EDIT: running the tests on your suggestion caused them to fail. Decided to just rename the var
                // count should start at 0, otherwise change name of var as it can be
                // missleading
                reverse_count = length; // count = 0
                // (current != null && length - indx - 1 > count)
                while (current != null && reverse_count > indx + 1) {
                    current = (BidirectionalNode<T>) current.getPrev();
                    reverse_count -= 1; // count ++
                }

                return current.getValue();
            }
        }
    }

    @Override
    public void insert(T value, int indx) throws Exception {
        BidirectionalNode<T> newNode = new StandardBidirectionalNode<>(value);
        if (indx > length) {
            throw new Exception("Index out of bound.");
        } else if (indx == 0) {
            newNode.setNext(head);
            head = newNode;
            head.setPrev(null);
            length += 1; 
        } else if (indx + 1 == length) {
            newNode.setPrev(tail);
            tail = newNode;
            tail.setNext(null);
            length += 1;
        } else {
            if ( length / 2 >= indx) {
                int count = 0;
                BidirectionalNode<T> current = head;
                BidirectionalNode<T> prev = null;
                BidirectionalNode<T> new_next = null;

                while (current != null & count < indx) {
                    prev = current;
                    current = (BidirectionalNode<T>) current.getNext();
                    count += 1;
                }
                
                if (current != null) {
                    // XD
                    prev.setNext(newNode);
                    newNode.setPrev(prev);
                    current.setPrev(newNode);
                    newNode.setNext(current);
                }
                
                length -= 1;
            } else {
                int count = length;
                BidirectionalNode<T> current = tail;
                BidirectionalNode<T> next = null;
                BidirectionalNode<T> new_prev = null;

                while (current != null & count > indx + 1) {
                    next = current;
                    current = (BidirectionalNode<T>) current.getPrev();
                    count -= 1;
                }
                
                if (current != null) {
                    new_prev = (BidirectionalNode<T>) current.getPrev();
                    new_prev.setNext(new_prev);
                    next.setPrev(new_prev);
                }

                length -= 1;
            }
        }     
    }

    @Override
    public void remove(int indx) throws Exception {
        // TODO Auto-generated method stub
        // head-indx0 -> n1-indx1 -> n2-indx2 -> ...
        // after remove indx1
        // // head-indx0 -> n2-indx1 -> ...
        if (indx > length) {
            throw new Exception("Index out of bound.");
        } else if (indx == 0) { // case could be covered in the lines 109-150 as well
            head = (BidirectionalNode<T>) head.getNext();
            head.setPrev(null);
            length -= 1;
        } else if (indx + 1 == length) { // similarly, case can be covered in the following blocks of code
            tail = (BidirectionalNode<T>) tail.getPrev();
            tail.setNext(null);
            length -= 1;
        } else { // de-nest this, no need for else{}, you can do an early return
            if (length / 2 >= indx) {
                int count = 0;
                BidirectionalNode<T> current = head;
                BidirectionalNode<T> prev = null;
                BidirectionalNode<T> new_next = null;

                while (current != null & count < indx) {
                    prev = current;
                    current = (BidirectionalNode<T>) current.getNext();
                    count += 1;
                }

                if (current != null) {
                    new_next = (BidirectionalNode<T>) current.getNext();
                    new_next.setPrev(prev);
                    prev.setNext(new_next);
                }

                length -= 1;
            } else {
                int count = length;
                BidirectionalNode<T> current = tail;
                BidirectionalNode<T> next = null;
                BidirectionalNode<T> new_prev = null;

                while (current != null & count > indx + 1) {
                    next = current;
                    current = (BidirectionalNode<T>) current.getPrev();
                    count -= 1;
                }

                if (current != null) {
                    new_prev = (BidirectionalNode<T>) current.getPrev();
                    new_prev.setNext(new_prev);
                    next.setPrev(new_prev);
                }

                length -= 1;
            }
        }

    }

}
