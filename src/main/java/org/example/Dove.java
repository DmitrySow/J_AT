package org.example;

import lombok.Getter;

@Getter
public class Dove extends Bird {

    public Dove(String displayName) {
        super(displayName, "Голубь");
    }

    @Override
    public void getSound() {
        System.out.println("голубиный звук");
    }
}
