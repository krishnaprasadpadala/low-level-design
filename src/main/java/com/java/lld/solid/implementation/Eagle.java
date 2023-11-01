package com.java.lld.solid.implementation;

import com.java.lld.solid.*;

public class Eagle extends Bird {
    public Eagle(String color, String size) {
        super(color, size);
    }


    @Override
    public void fly() {
        System.out.println("yahhh...!!!. Eagle is flying");
    }
}
