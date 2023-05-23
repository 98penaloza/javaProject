package com.project.node;

public interface BidirectionalNode<T> extends Node<T> {
    public Node<T> getPrev();
    public void setPrev(Node<T> node);
}
