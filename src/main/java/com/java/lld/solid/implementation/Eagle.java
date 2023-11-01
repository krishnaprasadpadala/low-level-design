package com.java.lld.solid.implementation;

import com.java.lld.solid.*;
import com.java.lld.solid.interfaces.*;

public class Eagle extends Bird implements Flyable {
    
    private final GlidingBehavior glidingBehavior;
    public Eagle(String color, String size, String type, GlidingBehavior glidingBehavior) {
        super(color, size, type);
        this.glidingBehavior = glidingBehavior;
    }
    


    @Override
    public void fly() {
        glidingBehavior.doFly(type);
    }
}
