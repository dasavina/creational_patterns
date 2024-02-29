package AbstractFactory.gardens;

import AbstractFactory.factories.GardenFactory;
import AbstractFactory.flowers.Flower;
import AbstractFactory.trees.Tree;
import AbstractFactory.waterSource.WaterSource;

public class Garden {
    Flower flower;
    Tree tree;
    WaterSource waterSource;

    public Garden(GardenFactory factory) {
        this.flower = factory.createFlower();
        this.tree = factory.createTree();
        this.waterSource = factory.createWaterSource();
    }

    @Override
    public String toString() {
        return "Garden{" +
                "\n" + flower.bloom() +
                "\n" + tree.grow() +
                "\n" + waterSource.fillWater() +
                '}';
    }
}
