package org.example.zoo;
import java.util.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Zoo {

    private List<String> zooList;

    public Zoo () {
        this.zooList = new ArrayList<>();
    }

    public void add(Animal animal) {
        this.zooList.add(animal.getType());
    }

    public int getSize() {
        return zooList.size();
    }

    public void getReport() {
        for (String animal : zooList) {
           int index = zooList.indexOf(animal) + 1;
            System.out.println(index + "-" + animal);
        }
    }


}
