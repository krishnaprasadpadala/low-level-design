package com.java.lld.solid.implementation;

import com.java.lld.solid.*;

public class Parrot extends Bird {
    public Parrot(String color, String size) {
        super(color, size);
    }

    @Override
    public void fly() {
        System.out.println("yahhh... Parrot is flying..");
    }
}
