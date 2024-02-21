import Prototype.flowers.Flower;
import Prototype.flowers.Iris;
import Prototype.flowers.Tulip;
import Singleton.Singleton;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        singletonPattern();
        builderPattern();
        factoryPattern();
        abstractFactoryPattern();
        prototypePattern();
    }

    public static void singletonPattern() {
        System.out.println("Singleton pattern");
        Singleton singleton1 = Singleton.getInstance("value1");
        Singleton singleton2 = Singleton.getInstance("value2");
        System.out.println(singleton1.value);
        System.out.println(singleton2.value);
    }

    public static void builderPattern(){}
    public static void factoryPattern(){}
    public static void abstractFactoryPattern(){}
    public static void prototypePattern(){
        List<Flower> flowers = new ArrayList<>();
        List<Flower> copies = new ArrayList<>();
        Iris iris = new Iris("purple", "dutch", 20);
        Iris clonedIris = new Iris(iris);
        Tulip tulip = new Tulip("white", "Darwin Hybrid", "cup");
    }
}