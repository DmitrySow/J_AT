package org.example.zoo;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public abstract class Animal {

    private String type;
    private int weight;

}
