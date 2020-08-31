package org.example;

import java.util.ArrayList;

public class Box<F extends Fruit> {

    private final ArrayList<F> box = new ArrayList<>();

    public Box() {

    }

    public float getWeight() {
        float weight = 0.0f;

        for (F o : box) {
            weight += o.getWeight();
        }
        return weight;
    }

    public boolean compare(Box anotherBox) {
        return getWeight() == anotherBox.getWeight();
    }

    public void moveTo(Box<F> anotherBox) {
        anotherBox.box.addAll(box);
        box.clear();
    }

    public void addFruit(F fruit, int amount) {
        for
        (int i = 0; i < amount; i++) {
            box.add(fruit);
        }
    }
}

