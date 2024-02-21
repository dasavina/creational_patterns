package Prototype.flowers;

import java.util.Objects;

public abstract class Flower {
    public String color;
    public String name;

    public Flower(String color, String name) {
        this.color = color;
        this.name = name;
    }

    public Flower(Flower sample) {
        if (sample != null) {
            this.color = sample.color;
            this.name = sample.name;
        }
    }
    public abstract Flower clone();

    @Override
    public boolean equals(Object obj) {
            if (!(obj instanceof Flower)) return false;
            Flower flower1 = (Flower) obj;
            return Objects.equals(flower1.color,color) && Objects.equals(flower1.name, name);
    }
}
