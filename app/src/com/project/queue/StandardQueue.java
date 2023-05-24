package com.project.queue;

import com.project.node.Node;
import com.project.node.StandardNode;

import lombok.Getter;

public class StandardQueue<T> implements Queue<T> {

    private Node<T> head = null;
    @Getter private int length = 0;

    public void add(T value) {
        Node<T> newNode = new StandardNode<>(value);
        
        length += 1;
        if (head == null) {
            head = newNode;
            return;
        } 
        
        Node<T> temp = head;
        while (temp.getNext() != null){
            temp = temp.getNext();
        }
        temp.setNext(newNode);
    }

    @Override
    public void pop() throws Exception {
        if (head == null){
            throw new Exception("Queue is empty, cannot pop element from empty queue.");
        } 
        head = head.getNext();
        length -= 1;
        
    }

    @Override
    public T get() throws Exception {
        if (head == null){
            throw new Exception("Queue is empty, cannot return element from empty queue.");
        } 
        return head.getValue();
    }
}
