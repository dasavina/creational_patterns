
import Builder.builders.DigitalClockBuilder;
import Builder.builders.MechanicalClockBuilder;
import Builder.clocks.DigitalClock;
import Builder.clocks.MechanicalClock;
import FactoryPattern.*;
import Singleton.Singleton;
import Prototype.flowers.*;


import java.util.ArrayList;
import java.util.List;

import static Prototype.CompareObjects.cloneAndCompare;


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

    public static void builderPattern() {
        MechanicalClockBuilder mechBuilder = new MechanicalClockBuilder();
        DigitalClockBuilder digitalBuilder = new DigitalClockBuilder();
        MechanicalClock mechanicalClock = mechBuilder.buildClock("white", "metal", "silver");
        DigitalClock digitalClock = digitalBuilder.buildClock("black", "plastic", "black");
        mechanicalClock.toString();
        digitalClock.toString();
    }

    public static void factoryPattern() {
        ClockFactory factory;
        String typeOfClock = "mechanical";

        factory = new MechanicalClockFactory();
        Clock clock = factory.createClock();
        clock.showTime();
    }

    public static void abstractFactoryPattern() {
    }

    public static void prototypePattern() {
        List<Flower> flowers = new ArrayList<>();
        List<Flower> copies = new ArrayList<>();
        Iris iris = new Iris("purple", "dutch", 20);
        Iris clonedIris = new Iris(iris);
        Tulip tulip = new Tulip("white", "Darwin Hybrid", "cup");
        cloneAndCompare(flowers, copies);
    }
}