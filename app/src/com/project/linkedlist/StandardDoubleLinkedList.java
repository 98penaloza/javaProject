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
            
            current.setNext(newNode);
            newNode.setPrev(current);
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
            
            int count;

            // decide where to start indexing (beginning/end)
            if (length / 2 >= indx) {
                BidirectionalNode<T> current = head;
                count = 0;
                
                while (current != null && count < indx) {
                    current = (BidirectionalNode<T>) current.getNext();
                    count += 1;
                }
                
                return current.getValue();
            } else {
                BidirectionalNode<T> current = tail;
                count = length;
                
                while (current != null && count > indx + 1) {
                    current = (BidirectionalNode<T>) current.getPrev();
                    count -= 1;
                }

                return current.getValue();
            }
        }
    }

    @Override
    public void insert(T value, int indx) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'insert'");
    }

    @Override
    public void remove(int indx) throws Exception {
        // TODO Auto-generated method stub
        // head-indx0 -> n1-indx1 -> n2-indx2 -> ...
        // after remove indx1
        // // head-indx0 -> n2-indx1 -> ...
        if (indx > length) {
            throw new Exception("Index out of bound.");
        } else if (indx == 0) {
            head = (BidirectionalNode<T>) head.getNext();
            head.setPrev(null);
            length -= 1; 
        } else if (indx + 1 == length) {
            tail = (BidirectionalNode<T>) tail.getPrev();
            tail.setNext(null);
            length -= 1;
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
