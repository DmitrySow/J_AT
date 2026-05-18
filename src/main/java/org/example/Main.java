package org.example;

import org.example.zoo.*;
import org.example.zoo.Animal;
import org.example.collections.*;

import java.util.*;

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
        System.out.println("Время для TreeSet - " + (hashTimeFinish2 - hashTimeStart2));

        //Задание на сортировку
        List<Student> students = new ArrayList<>();

        students.add(new Student("Олег", 20));
        students.add(new Student("Егор", 19));
        students.add(new Student("Макар", 28));
        students.add(new Student("Андрей", 21));

        students.sort(new AgeSort());

        for (Student student : students) {
            student.print();
        }
        ;

        //Задание на Map

        Map<String, Integer> map = new HashMap<>();

        map.put("Олег", 5);
        map.put("Егор", 4);
        map.put("Макар", 3);
        map.put("Андрей", 2);

        String name = "Наталья";
        Integer res = null;

        if (map.containsKey(name)) {
            res = map.get(name);
            System.out.println(res);
        } else {
            System.out.println(res);
        }

        //Задание на ArrayList

        List<Integer> AList = new ArrayList<>();

        for (Integer x = 1; x <= 100; x++) {
            AList.add(x);
        }

        Iterator<Integer> iter = AList.iterator();

        while (iter.hasNext()) {
            Integer num = iter.next();
            if (num % 2 != 0) {
                iter.remove();
            }
        }

        System.out.println(AList);

    }
}