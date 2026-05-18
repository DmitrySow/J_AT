package org.example.collections;

import lombok.Getter;
import org.example.Dove;

import java.util.BitSet;
import java.util.HashSet;
import java.util.TreeSet;

@Getter
public class Sets {

    private HashSet<Integer> HashRand;
    private TreeSet<Integer> TreeRand;
    private HashSet<Integer> Target;

    public Sets() {
        HashRand = new HashSet<>();
        TreeRand = new TreeSet<>();
        Target = new HashSet<>();

        for (int i = 0; i < 10000; i++) {
            Integer hRand = (int) (Math.random() * 100000);
            Integer tRand = (int) (Math.random() * 11000);
            HashRand.add(hRand);
            TreeRand.add(tRand);
            if (i % 2 == 0 & i < 1000) {
                Target.add(hRand);
            } else if (i % 2 != 0 & i < 99) {
                Target.add(tRand);
            }
        }
    }
}

