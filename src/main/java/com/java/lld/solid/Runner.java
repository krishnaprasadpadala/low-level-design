package com.java.lld.solid;

import com.java.lld.solid.implementation.*;
import com.java.lld.solid.interfaces.*;

import java.util.*;

public class Runner {

    public static void main(String[] args) {
        FlyingBehavior flappingBehavior = new FlappingBehavior();
        FlyingBehavior glidingBehavior = new GlidingBehavior();
        Flyable eagle = new Eagle("brown","medium", "eagle", glidingBehavior);
        Flyable parrot = new Parrot("green", "medium", "parrot", glidingBehavior);
        Flyable sparrow = new Sparrow("wheatish", "medium", "sparrow", flappingBehavior);
        Swimmable penguin = new Penguin("green", "medium", "penguin");
        
        List<Flyable> birds = new ArrayList<>();
        birds.add(eagle);
        birds.add(parrot);
        birds.add(sparrow);
        
        birds.forEach(Flyable::fly);
        
        penguin.swim();

    }
}

// NOTES
/* 
   with this code implementation we have fixed all SOLID violations.
   
 */
