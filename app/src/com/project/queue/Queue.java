package com.project.queue;

public interface Queue<T> {
    public void add(T value);

    public void pop() throws Exception;

    public int getLength();

    public T get() throws Exception;
}
