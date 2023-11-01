package com.java.lld.solid;

import com.java.lld.solid.implementation.*;
import com.java.lld.solid.interfaces.*;

import java.util.*;

public class Runner {

    public static void main(String[] args) {
        Flyable eagle = new Eagle("brown","medium");
        Flyable parrot = new Parrot("green", "medium");
        Flyable sparrow = new Sparrow("wheatish", "medium");
        Swimmable penguin = new Penguin("green", "medium");
        
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
    With this implementation we have fixed LSP by not forcing the penguin to fly
    but allowing it to swim.
    
    But the problem with this code is the Flying behavior of Eagle and Sparrow is Same because they flap
    and we are duplicating the behavior.

 */
