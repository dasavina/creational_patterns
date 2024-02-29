package FactoryPattern;

import java.time.LocalDate;
import java.time.LocalTime;


public class DigitalClock extends Clock{

    @Override
    public void showTime() {
        System.out.println(LocalDate.now() + "\n" + LocalTime.now());
    }

    @Override
    public void setAlarm(String time) {

    }

    @Override
    public void alarmGoesOff() {

    }
}
