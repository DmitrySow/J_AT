package org.example;

import org.example.zoo.*;
import org.example.zoo.Animal;
import org.example.collections.*;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        //Заданиe на List
        Lists birdList = new Lists();

        long arrTimeStart = System.currentTimeMillis();

        for (int i = 0; i < 49999; i++) {
            birdList.getArrayBirds().remove(i);
        }

        long arrTimeFinish = System.currentTimeMillis();
        System.out.println("Время для ArrayList - " + (arrTimeFinish - arrTimeStart));

        long linkTimeStart = System.currentTimeMillis();

        for (int i = 0; i < 49999; i++) {
            birdList.getLinkedBirds().remove(i);
        }

        long linkTimeFinish = System.currentTimeMillis();
        System.out.println("Время для LinkedList - " + (linkTimeFinish - linkTimeStart));

        //Задание на Set

        Sets randomSets = new Sets();
        Set<Integer> hash = randomSets.getHashRand();
        System.out.println(hash.size());
        Set<Integer> tree = randomSets.getTreeRand();
        System.out.println(tree.size());
        Set<Integer> target = randomSets.getTarget();
        System.out.println(target.size());

        int i = 0;
        int j = 0;

        long hashTimeStart = System.currentTimeMillis();

        for (Integer num : target) {
            if (hash.contains(num)) {
                i++;
            }
        }
        System.out.println(i);

        long hashTimeFinish = System.currentTimeMillis();
        System.out.println("Время для HashSet - " + (hashTimeFinish - hashTimeStart));

        long hashTimeStart2 = System.currentTimeMillis();

        for (Integer num : target) {
            if (tree.contains(num)) {
                j++;
            }
        }
        System.out.println(j);

        long hashTimeFinish2 = System.currentTimeMillis();
        System.out.println("Время для HashSet - " + (hashTimeFinish2 - hashTimeStart2));
    }
}