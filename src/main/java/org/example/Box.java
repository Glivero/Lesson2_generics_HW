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

    public boolean moveTo(Box<F> anotherBox) {
        anotherBox.box.addAll(box);
        box.clear();
        return true;
    }

    public boolean addFruit(F fruit, int amount) {
        for
        (int i = 0; i < amount; i++) {
            box.add(fruit);
        }

        return true;

    }
}

