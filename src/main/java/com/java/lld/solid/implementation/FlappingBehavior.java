package com.java.lld.solid.implementation;

import com.java.lld.solid.interfaces.*;

public class FlappingBehavior implements FlyingBehavior {
    
    @Override
    public void makeFly(String type) {
        System.out.println("Yahhh...!!! "+type+" is Flapping...!!!");
    }
}
