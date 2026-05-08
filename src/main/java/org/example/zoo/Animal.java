package org.example.zoo;

public abstract class Animal {

    private String type;
    private int weight;

    public Animal(String type, int weight) {
        this.type = type;
        this.weight = weight;
    }

    public String getType() {
        return type;
    }
}
