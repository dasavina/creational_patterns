package Prototype.flowers;

import java.util.Objects;

public class Tulip extends Flower {
    String sort;

    public Tulip(String color, String name, String sort) {
        super(color, name);
        this.sort = sort;
    }

    public Tulip(Tulip sample) {
        super(sample);
        if (sample == null) {
            this.sort = sample.sort;
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
        return Objects.equals(tulip1.sort, this.sort);
    }
}
