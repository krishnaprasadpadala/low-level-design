package com.java.lld.solid.implementation;

import com.java.lld.solid.*;
import com.java.lld.solid.interfaces.*;

public class Eagle extends Bird implements Flyable {
    
    private final FlyingBehavior glidingBehavior;
    public Eagle(String color, String size, String type, FlyingBehavior glidingBehavior) {
        super(color, size, type);
        this.glidingBehavior = glidingBehavior;
    }
    


    @Override
    public void fly() {
        glidingBehavior.makeFly(type);
    }
}
