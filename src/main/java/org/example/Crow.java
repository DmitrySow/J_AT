package org.example;

public class Crow extends Bird {

    public Crow(String displayName) {
        super(displayName, "Ворон");
    }

    @Override
    public void getSound() {
        System.out.println("вороний звук");
    }
}
