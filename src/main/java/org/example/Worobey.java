package org.example;

public class Worobey extends Bird {

        public Worobey (String displayName) {
            super(displayName, "Воробей");
        }

        @Override
        public void getSound() {
            System.out.println("воробьиный звук");
        }

}
