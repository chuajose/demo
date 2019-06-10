package com.example.demo;

public class Greeting {

    private final long id;
    private final String content;
    private final String pepe;

    public Greeting(long id, String content) {
        this.id = id;
        this.content = content;
        this.pepe = "ad";
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

    public String getPepe() {
        return pepe;
    }
}