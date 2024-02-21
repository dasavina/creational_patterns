package Builder.clocks;

import Builder.components.Corpse;
import Builder.components.Details;
import Builder.components.Display;
import Builder.components.EnergySource;

public class DigitalClock extends ClockFromDetails{
    private String alarmSound;
    public DigitalClock(Display display, Details details, EnergySource energySource, Corpse corpse, String alarmSound) {
        super(display, details, energySource, corpse);
        this.alarmSound = alarmSound;
    }

    public String getAlarmSound() {
        return alarmSound;
    }
}
