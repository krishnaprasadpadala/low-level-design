package com.java.lld.solid.implementation;

import com.java.lld.solid.interfaces.*;

public class GlidingBehavior implements FlyingBehavior {
    
    @Override
    public void makeFly(String type) {
        System.out.println("Yahhh...!!! "+type+" is Gliding...!!!");
    }
}
