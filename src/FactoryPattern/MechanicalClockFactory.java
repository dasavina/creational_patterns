package FactoryPattern;

public class MechanicalClockFactory extends ClockFactory{
    @Override
    public Clock createClock() {
        return new MechanicalClock();
    }
}
