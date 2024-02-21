package Builder.builders;

import Builder.clocks.ClockFromDetails;
import Builder.clocks.DigitalClock;
import Builder.components.Corpse;
import Builder.components.Details;
import Builder.components.Display;
import Builder.components.EnergySource;

public class DigitalClockBuilder implements Builder{
    private Display display;
    private Details details;
    private EnergySource energySource;
    private Corpse corpse;
    private String alarmSound;
    @Override
    public void buildDisplay(Display display) {
        this.display = display;
    }

    @Override
    public void buildDetails(Details details) {
        this.details = details;
    }

    @Override
    public void buildEnergySource(EnergySource energySource) {
        this.energySource = energySource;
    }

    @Override
    public void buildCorpse(Corpse corpse) {
        this.corpse = corpse;
    }

    @Override
    public void buildSound(String sound) {
        this.alarmSound = sound;
    }


    public ClockFromDetails getResult()
    {
        return new DigitalClock(display, details, energySource, corpse, alarmSound);
    }
}
