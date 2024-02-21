package AbstractFactory.factories;

import AbstractFactory.flowers.Flower;
import AbstractFactory.flowers.Tulip;
import AbstractFactory.trees.Maple;
import AbstractFactory.trees.Tree;
import AbstractFactory.waterSource.Fountain;
import AbstractFactory.waterSource.WaterSource;

public class EuropeanGardenFactory implements GardenFactory{
    @Override
    public Flower createFlower() {
        return new Tulip();
    }

    @Override
    public Tree createTree() {
        return new Maple();
    }

    @Override
    public WaterSource createWaterSource() {
        return new Fountain();
    }
}
