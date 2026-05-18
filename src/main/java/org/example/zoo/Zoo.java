package org.example.zoo;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Zoo {

    private List<Animal> zooList;

    public Zoo() {
        this.zooList = new ArrayList<>();
    }

    public void add(Animal animal) {
        this.zooList.add(animal);
    }

    public int getSize() {
        return zooList.size();
    }

    public void getReport() {
        for (Animal animal : zooList) {
            String type = animal.getType();
            int index = zooList.indexOf(animal) + 1;
            System.out.println(index + "-" + type);
        }
    }
}
