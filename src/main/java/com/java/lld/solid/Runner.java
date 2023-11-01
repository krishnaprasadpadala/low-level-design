package com.java.lld.solid;

import com.java.lld.solid.implementation.*;
import com.java.lld.solid.interfaces.*;

public class Runner {

    public static void main(String[] args) {
        Flyable eagle = new Eagle("brown","medium");
        Flyable parrot = new Parrot("green", "medium");
        
        eagle.fly();
        parrot.fly();
    }
}

// NOTES
/*
    With current implementation SRP and OCP are fixed because
        - Bird class no more hold flying behavior of both Birds Eagle and Parrot. SRP is Fixed
        - To modify flying behavior of Eagle/Parrot we have to open only that specific class - OCP is fixed
 */
