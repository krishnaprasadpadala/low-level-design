package com.java.lld.solid;

import com.java.lld.solid.implementation.*;
import com.java.lld.solid.interfaces.*;

import java.util.*;

public class Runner {

    public static void main(String[] args) {
        FlappingBehavior flappingBehavior = new FlappingBehavior();
        GlidingBehavior glidingBehavior = new GlidingBehavior();
        Flyable eagle = new Eagle("brown","medium", "eagle", glidingBehavior);
        Flyable parrot = new Parrot("green", "medium", "parrot", flappingBehavior);
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
   With this implementation we have fixed the code duplication issue, but we have
   a new problem with this code that for example if we have to change the behavior 
   of Parrot to Gliding we have to open 2 classes Bird and Parrot. It violates 
   OCP, and it can be fixed by applying Dependency inversion principle.
   
 */
