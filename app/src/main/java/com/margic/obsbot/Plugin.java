package com.margic.obsbot;

public class Plugin {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        System.out.println(new Plugin().getGreeting());
    }
}
