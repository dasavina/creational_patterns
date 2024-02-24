package AbstractFactory.waterSource;

public class Fountain implements WaterSource{
    @Override
    public String fillWater() {
        return("Fountain is filled with water");
    }
}
