package Builder.components;

public class Display {
    String type;
    String color;

    public Display(String type, String color) {
        this.type = type;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Display{" +
                "type='" + type + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
