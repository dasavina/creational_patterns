package FactoryPattern;

import java.time.LocalDateTime;


public class DigitalClock extends Clock{

    @Override
    public void showTime() {
        System.out.println(LocalDateTime.now());
    }

    @Override
    public void setAlarm(String time) {

    }

    @Override
    public void alarmGoesOff() {

    }
}
