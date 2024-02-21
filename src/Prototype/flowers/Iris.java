package Prototype.flowers;

public class Iris extends Flower {
    public int height;

    public Iris(String color, String name, int height) {
        super(color, name);
        this.height = height;
    }


    public Iris(Iris sample) {
        super(sample);
        if (sample == null) {
            this.height = sample.height;
        }
    }

    @Override
    public Flower clone() {
        return new Iris(this);
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Iris) || !super.equals(obj)) return false;
        Iris iris1 = (Iris) obj;
        return iris1.height == height;
    }
}
