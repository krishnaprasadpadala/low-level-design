package com.java.lld.solid.implementation;

import com.java.lld.solid.*;

public class Penguin extends Bird {


    public Penguin(String color, String size) {
        super(color, size);
    }

    @Override
    public void fly() {
        throw new RuntimeException("sorry... Penguin cannot fly. I can only swim");
    }
}
