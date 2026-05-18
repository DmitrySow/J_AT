package org.example.collections;

import lombok.Getter;
import org.example.Bird;
import org.example.Dove;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

@Getter
public class Lists {

    private ArrayList<Bird> arrayBirds;
    private LinkedList<Bird> linkedBirds;

    public Lists() {

        arrayBirds = new ArrayList<>();
        linkedBirds = new LinkedList<>();

        for (int i = 0; i < 100000; i++) {
            arrayBirds.add(new Dove("Голубь №" + i));
            linkedBirds.add(new Dove("Воробей №" + i));
        }
    }
}