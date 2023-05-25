package com.project;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

import com.project.node.Node;
import com.project.node.StandardNode;
import com.project.linkedlist.LLinkedList;
import com.project.linkedlist.StandardLinkedList;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

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
        System.out.println(new App().getGreeting());
        Arrays.asList(node1, node2, node3)
                .forEach((n) -> System.out.println(n.getValue()));

    }
}
