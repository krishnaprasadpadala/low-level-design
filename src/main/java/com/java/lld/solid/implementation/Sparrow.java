package com.java.lld.solid.implementation;

import com.java.lld.solid.*;
import com.java.lld.solid.interfaces.*;

public class Sparrow extends Bird implements Flyable {

    private final FlyingBehavior flappingBehavior;
    public Sparrow(String color, String size, String type, FlyingBehavior flappingBehavior) {
        super(color, size, type);
        this.flappingBehavior = flappingBehavior;
    }

    @Override
    public void fly() {
        flappingBehavior.makeFly(type);
    }
}
