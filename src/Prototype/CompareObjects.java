package Prototype;

import Prototype.flowers.Flower;

import java.util.List;

public class CompareObjects {
    private static void cloneAndCompare(List<Flower> flowers, List<Flower> clones) {
        for (Flower flower : flowers) {
            clones.add(flower.clone());
        }
        for (int i = 0; i < flowers.size(); i++) {
            if (flowers.get(i) != clones.get(i)) {
                System.out.println(i + "different objects");
                if (flowers.get(i).equals(clones.get(i))) {
                    System.out.println(i + "identical");
                } else {
                    System.out.println(i + "not identical");
                }
            } else {
                System.out.println(i + "same object");
            }
        }
    }
}
