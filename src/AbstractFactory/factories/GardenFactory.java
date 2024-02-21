package AbstractFactory.factories;

import AbstractFactory.flowers.Flower;
import AbstractFactory.trees.Tree;
import AbstractFactory.waterSource.WaterSource;

public interface GardenFactory {
    Flower createFlower();
    Tree createTree();
    WaterSource createWaterSource();
}
