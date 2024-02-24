package AbstractFactory.waterSource;

public class Pond implements WaterSource{
    @Override
    public String fillWater() {
        return ("Pond is filled with water");
    }
}
