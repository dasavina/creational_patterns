package AbstractFactory.waterSource;

public class Fountain implements WaterSource{
    @Override
    public void fillWater() {
        System.out.println("Fountain is filled with water");
    }
}
