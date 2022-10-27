package com.java.lld.solid;

public class Bird {

    private String name;
    private String color;
    private String type;
    private String size;

    public Bird(String color, String type, String size) {
        this.color = color;
        this.type = type;
        this.size = size;
    }

    public void makeSound() {
        System.out.println("Bird:" + name+" is making sound.");
    }

    /**
     * Here the probelm is code is
     * 1. Holding multiple responsibilities
     * 2. It is not extendable
     * 3. It is not Testable.
     */
    public void fly() {
        if("Sparrow".equalsIgnoreCase(name)) {
            System.out.println("Sparrow is flying...");
        } else if("Parrot".equalsIgnoreCase(name)) {
            System.out.println("Parrot is flying...");
        } else if("Eagle".equalsIgnoreCase(name)) {
            System.out.println("Eagle is flying...");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
}
