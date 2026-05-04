package org.example;

public class Bird {

    final private String displayName;
    final private String type;

    public Bird(String displayName, String type) {
        this.displayName = displayName;
        this.type = type;
    }

    public void getName() {
        System.out.print(displayName);
    }

    public void getType() {
        System.out.print(type);
    }

    public void getSound() {
        System.out.println("птичий звук");
    }

    public void getInfo() {
        getType();
        System.out.print(" ");
        getName();
        System.out.print(" издает ");
        getSound();
    }
}
