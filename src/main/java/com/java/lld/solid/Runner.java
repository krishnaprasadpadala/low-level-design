package com.java.lld.solid;

import com.java.lld.solid.implementation.*;

import java.util.*;

public class Runner {

    public static void main(String[] args) {
        Bird eagle = new Eagle("brown","medium");
        Bird parrot = new Parrot("green", "medium");
        Bird penguin = new Penguin("green", "medium");
        
        List<Bird> birds = new ArrayList<>();
        birds.add(eagle);
        birds.add(parrot);
        birds.add(penguin);
        
        birds.forEach(Bird::fly);

    }
}

// NOTES
/* 
    Liscov violation: With this code we are forcing the Penguin to implement the fly method
    which it doesn't intend to implement and it throws exception.

 */
