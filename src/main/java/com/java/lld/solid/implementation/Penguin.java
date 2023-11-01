package com.java.lld.solid.implementation;

import com.java.lld.solid.*;
import com.java.lld.solid.interfaces.*;

public class Penguin extends Bird implements Swimmable {


    public Penguin(String color, String size, String type) {
        super(color, size, type);
    }


    @Override
    public void swim() {
        System.out.println("yahh..."+ type +" is swimming...");
    }
}
