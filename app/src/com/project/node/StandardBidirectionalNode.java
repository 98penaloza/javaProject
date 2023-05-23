package com.project.node;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@AllArgsConstructor
@RequiredArgsConstructor
public class StandardBidirectionalNode<T> implements BidirectionalNode<T>{
    @NonNull private T value;
    @Builder.Default
    private Node<T> next = null;
    @Builder.Default
    private Node<T> prev = null;
}
