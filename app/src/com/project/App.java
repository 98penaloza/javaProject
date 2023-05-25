package com.project;

import java.util.Arrays;
<<<<<<< HEAD
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
=======
>>>>>>> 886101cadba35e922b82f96f38a23c3006b8fbde

import com.project.node.Node;
import com.project.node.StandardNode;
import com.project.linkedlist.LLinkedList;
import com.project.linkedlist.StandardLinkedList;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

<<<<<<< HEAD
    public static void main(String[] args) throws Exception {
        Node node1 = StandardNode.builder().value(1).build();
        Node node2 = new StandardNode(2);
        Node node3 = new StandardNode(3, null);
        LLinkedList list1 = new StandardLinkedList();
        list1.add(1);
        list1.add(2);
        list1.add(4);
        list1.add(5);
        list1.add(6);
        list1.add(7);
        
        list1.remove(3);
        System.out.println(list1.get(3));
        System.out.println(list1.get(4));
        //System.out.println(list1.get(5));

        Map s = new HashMap<>();
=======
    public static void main(String[] args) {
        Node<?> node1 = StandardNode.builder().value(1).build();
        Node<Integer> node2 = new StandardNode<>(2);
        Node<Integer> node3 = new StandardNode<>(3, null);
>>>>>>> 886101cadba35e922b82f96f38a23c3006b8fbde
        System.out.println(new App().getGreeting());
        Arrays.asList(node1, node2, node3)
                .forEach((n) -> System.out.println(n.getValue()));

    }
}
