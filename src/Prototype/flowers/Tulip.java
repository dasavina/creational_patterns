package Prototype.flowers;

import java.util.Objects;

public class Tulip extends Flower {
    String shape;

    public Tulip(String color, String name, String shape) {
        super(color, name);
        this.shape = shape;
    }

    public Tulip(Tulip sample) {
        super(sample);
        if (sample == null) {
            this.shape = sample.shape;
        }
    }

    @Override
    public Flower clone() {
        return new Tulip(this);
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Tulip) || !super.equals(obj)) return false;
        Tulip tulip1 = (Tulip) obj;
        return Objects.equals(tulip1.shape, this.shape);
    }
}
