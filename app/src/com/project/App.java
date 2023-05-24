package com.project;

import java.util.Arrays;

import com.project.node.Node;
import com.project.node.StandardNode;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        Node<?> node1 = StandardNode.builder().value(1).build();
        Node<Integer> node2 = new StandardNode<>(2);
        Node<Integer> node3 = new StandardNode<>(3, null);
        System.out.println(new App().getGreeting());
        Arrays.asList(node1, node2, node3)
                .forEach((n) -> System.out.println(n.getValue()));

    }
}
