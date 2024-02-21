package AbstractFactory.waterSource;

public class Pond implements WaterSource{
    @Override
    public void fillWater() {
        System.out.println("Pond is filled with water");
    }
}
