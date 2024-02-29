package Builder.components;

public class Details {
    String type;

    public Details(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Details{" +
                "type='" + type + '\'' +
                '}';
    }
}
