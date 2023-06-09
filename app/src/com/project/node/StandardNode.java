package com.project.node;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;


@Data // getters and setters
@Builder 
@AllArgsConstructor
@RequiredArgsConstructor
public class StandardNode<T> implements Node<T> {
    @NonNull private T value;
    @Builder.Default private Node<T> next = null;
}
