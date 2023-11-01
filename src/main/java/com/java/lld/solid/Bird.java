package com.java.lld.solid;

import lombok.*;

@Data
public class Bird {
    private String color;
    private String type;
    private String size;

    public Bird(String color, String type, String size) {
        this.color = color;
        this.type = type;
        this.size = size;
    }

    public void makeSound() {
        System.out.println("Bird:" + type+" is making sound.");
    }

    public void fly() {
        if("sparrow".equalsIgnoreCase(type)) {
            System.out.println("Sparrow is flying...");
        } else if("Parrot".equalsIgnoreCase(type)) {
            System.out.println("Parrot is flying...");
        } else if("Eagle".equalsIgnoreCase(type)) {
            System.out.println("Eagle is flying...");
        }
    }
}
