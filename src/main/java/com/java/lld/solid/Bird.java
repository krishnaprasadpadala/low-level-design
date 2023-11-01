package com.java.lld.solid;

import lombok.*;

@Data
public abstract class Bird {
    private String color;
    private String size;

    public Bird(String color, String size) {
        this.color = color;
        this.size = size;
    }

    public void makeSound() {
        System.out.println("Making sound....!!!");
    }
    
}
