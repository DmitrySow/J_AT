package org.example.collections;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

@AllArgsConstructor
@Data
public class Student {
    private String name;
    private Integer age;

    public void print() {
        System.out.println("Студент " + name + " возрастом " + age);
    }
}
