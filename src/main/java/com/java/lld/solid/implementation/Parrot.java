package com.java.lld.solid.implementation;

import com.java.lld.solid.*;
import com.java.lld.solid.interfaces.*;

public class Parrot extends Bird implements Flyable {
    public Parrot(String color, String size) {
        super(color, size);
    }

    @Override
    public void fly() {
        System.out.println("yahhh... Parrot is flying..");
    }
}
