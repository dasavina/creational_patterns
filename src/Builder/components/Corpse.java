package Builder.components;

public class Corpse {
    String material;
    String color;

    public Corpse(String material, String color) {
        this.material = material;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Corpse{" +
                "material='" + material + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
