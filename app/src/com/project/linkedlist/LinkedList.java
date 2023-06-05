package com.project.linkedlist;

public interface LinkedList<T> {
    public void add(T value);
    public void remove(int indx) throws Exception;
    public T get(int indx) throws Exception;
    public int getLength();
    public void insert(T value, int indx) throws Exception;
}
