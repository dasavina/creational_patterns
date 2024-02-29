
import AbstractFactory.factories.EuropeanGardenFactory;
import AbstractFactory.factories.GardenFactory;
import AbstractFactory.factories.JapaneseGardenFactory;
import AbstractFactory.gardens.Garden;
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
        System.out.println("Singleton pattern");
        singletonPattern();
        System.out.println("Builder pattern");
        builderPattern();
        System.out.println("factory pattern");
        factoryPattern();
        System.out.println("Abstract factory pattern");
        abstractFactoryPattern();
        System.out.println("Prototype pattern");
        prototypePattern();
    }

    public static void singletonPattern() {

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
        System.out.println(mechanicalClock.toString());
        System.out.println(digitalClock.toString());
    }

    public static void factoryPattern() {
        ClockFactory factory;
        String typeOfClock = "mechanical";
        if (typeOfClock.equals("mechanical"))
        {
            factory = new MechanicalClockFactory();
        }
        else {
            factory = new DigitalClockFactory();
        }


        Clock clock = factory.createClock();
        clock.showTime();
    }

    public static void abstractFactoryPattern() {
        String input = "";
        Garden garden;
        GardenFactory factory;
        if (input.equals("European"))
        {
            factory = new EuropeanGardenFactory();
        }
        else {
            factory = new JapaneseGardenFactory();
        }
        garden = new Garden(factory);
        System.out.println(garden.toString());
    }

    public static void prototypePattern() {
        List<Flower> flowers = new ArrayList<>();
        List<Flower> copies = new ArrayList<>();
        Iris iris = new Iris("purple", "dutch", 20);
        Iris clonedIris = new Iris(iris);
        Tulip tulip = new Tulip("white", "Darwin Hybrid", "cup");
        flowers.add(iris);
        flowers.add(clonedIris);
        flowers.add(tulip);
        cloneAndCompare(flowers, copies);
    }
}