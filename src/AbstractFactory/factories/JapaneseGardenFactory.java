package AbstractFactory.factories;

import AbstractFactory.flowers.Flower;
import AbstractFactory.flowers.Iris;
import AbstractFactory.trees.Plum;
import AbstractFactory.trees.Tree;
import AbstractFactory.waterSource.Pond;
import AbstractFactory.waterSource.WaterSource;

public class JapaneseGardenFactory implements GardenFactory{

    @Override
    public Flower createFlower() {
        return new Iris();
    }

    @Override
    public Tree createTree() {
        return new Plum();
    }

    @Override
    public WaterSource createWaterSource() {
        return new Pond();
    }
}
