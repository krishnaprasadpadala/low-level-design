package com.java.lld.solid;

public class Runner {

    public static void main(String[] args) {
        Bird sparrow = new Bird("brown", "sparrow", "medium");
        Bird parrot = new Bird("green", "parrot", "medium");
        
        sparrow.fly();
        sparrow.makeSound();
        
        parrot.fly();
        parrot.makeSound();
    }
}

// NOTES
/*
  The violations with current code implementation are
  SRP: The Bord class holds fly behavior of multiple Bird types
  OCP: If sparrow flying behavior has to be changed or Parrot Flying behavior has to changed
       same class has to be opened for modification.
 */
