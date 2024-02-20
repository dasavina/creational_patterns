package FactoryPattern;


import java.time.LocalTime;

public class MechanicalClock extends Clock{
    @Override
    public void showTime() {
        System.out.println(LocalTime.now());
    }

    @Override
    public void setAlarm(String time) {

    }

    @Override
    public void alarmGoesOff() {

    }
}
