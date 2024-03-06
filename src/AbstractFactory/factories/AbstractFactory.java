package AbstractFactory.factories;

import AbstractFactory.flowers.Flower;
import AbstractFactory.trees.Tree;
import AbstractFactory.waterSource.WaterSource;

public class AbstractFactory {
    public GardenFactory getFactory(String input)
    {
        return switch (input) {
            case "Japanese" -> new JapaneseGardenFactory();
            case "European" -> new EuropeanGardenFactory();
            default -> new GardenFactory() {
                @Override
                public Flower createFlower() {
                    return null;
                }

                @Override
                public Tree createTree() {
                    return null;
                }

                @Override
                public WaterSource createWaterSource() {
                    return null;
                }
            };
        };
    }
}
