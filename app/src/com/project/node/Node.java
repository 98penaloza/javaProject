package com.project.node;

public interface Node<T> {
    public T getValue();
    public void setValue(T value);
    public Node<T> getNext();
    public void setNext(Node<T> node);
}

