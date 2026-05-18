package org.example.collections;
import java.util.Comparator;

public class AgeSort implements Comparator<Student> {

    @Override
    public int compare(Student a, Student b) {
        return a.getAge() - b.getAge();
    }
}
