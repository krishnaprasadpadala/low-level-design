package com.java.lld.solid.implementation;

import com.java.lld.solid.*;
import com.java.lld.solid.interfaces.*;

public class Parrot extends Bird implements Flyable {

    private final FlyingBehavior flappingBehavior;
    public Parrot(String color, String size, String type,  FlyingBehavior flappingBehavior) {
        super(color, size, type);
        this.flappingBehavior = flappingBehavior;
    }

    @Override
    public void fly() {
        flappingBehavior.makeFly(type);
    }
}
