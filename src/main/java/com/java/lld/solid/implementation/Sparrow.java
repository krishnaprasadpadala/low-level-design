package com.java.lld.solid.implementation;

import com.java.lld.solid.*;
import com.java.lld.solid.interfaces.*;

public class Sparrow extends Bird implements Flyable {
    public Sparrow(String color, String size) {
        super(color, size);
    }

    @Override
    public void fly() {
        System.out.println("yahhh... Sparrow is flying..");
    }
}
