package com.project;

public class Playground {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) throws Exception {
        // just a rapid testing env :)

        System.out.println(new Playground().getGreeting());

    }
}
