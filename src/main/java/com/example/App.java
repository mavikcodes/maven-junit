package com.example;

/**
 * Simple example application.
 */
public class App {
    public static String greet(String name) {
        return "Hello, " + name + "!";
    }

    public static void main(String[] args) {
        String name = (args.length > 0) ? args[0] : "World";
        System.out.println(greet(name));
    }
}