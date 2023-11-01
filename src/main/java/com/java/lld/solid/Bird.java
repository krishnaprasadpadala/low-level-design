package com.java.lld.solid;

import lombok.*;

@Data
public abstract class Bird {
    public String color;
    public String size;
    public String type;

    public Bird(String color, String size, String type) {
        this.color = color;
        this.size = size;
        this.type = type;
    }

    public void makeSound() {
        System.out.println("Making sound....!!!");
    }
    
}
