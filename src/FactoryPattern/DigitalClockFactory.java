package FactoryPattern;

public class DigitalClockFactory extends ClockFactory{
    @Override
    public Clock createClock() {
        return new DigitalClock();
    }
}
