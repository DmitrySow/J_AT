package org.example;
import org.example.zoo.Zoo;
import org.example.zoo.Animal;

public class Main {
    static void main() {

        Bird woribey = new Worobey("Олег");
        woribey.getInfo();

        Bird dove = new Dove("Семен");
        dove.getInfo();

        Bird crow = new Crow("Виктор");
        crow.getInfo();

        Animal lion = new Animal("Lion", 100);
        Animal zebra = new Animal("Zebra", 40);
        Animal crocodile = new Animal("Crocodile", 145);

        Zoo zoo = new Zoo();
        zoo.add(lion);
        zoo.add(zebra);
        zoo.add(crocodile);
        System.out.println("Количество животных - " + zoo.getSize());
        zoo.getReport();

    }
}
