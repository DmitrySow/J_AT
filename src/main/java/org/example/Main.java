package org.example;
import org.example.zoo.*;
import org.example.zoo.Animal;

public class Main {
    public static void main(String[] args) {

        Bird woribey = new Worobey("Олег");
        woribey.getInfo();

        Bird dove = new Dove("Семен");
        dove.getInfo();

        Bird crow = new Crow("Виктор");
        crow.getInfo();

        Animal dog = new Dog(45);
        Animal cow = new Cow(300);
        Animal cat = new Cat(5);

        Zoo zoo = new Zoo();
        zoo.add(dog);
        zoo.add(cat);
        zoo.add(cow);
        System.out.println("Количество животных - " + zoo.getSize());
        zoo.getReport();

    }
}
