package Builder.builders;

import Builder.clocks.ClockFromDetails;
import Builder.clocks.DigitalClock;
import Builder.components.Corpse;
import Builder.components.Details;
import Builder.components.Display;
import Builder.components.EnergySource;

public class DigitalClockBuilder implements Builder {
    private Display display;
    private Details details;
    private EnergySource energySource;
    private Corpse corpse;
    private String alarmSound;

    public DigitalClock buildClock(String displayColor, String corpseMaterial, String corpseColor)
    {
        buildDetails();
        buildEnergySource();
        buildCorpse(corpseColor, corpseMaterial);
        buildDisplay(displayColor);
        buildSound();
        return new DigitalClock(display, details, energySource, corpse, alarmSound);
    }

    @Override
    public void buildDisplay(String displayColor) {
        this.display = new Display("electronic", displayColor);
    }

    @Override
    public void buildDetails() {
        this.details = new Details("electronic");
    }

    @Override
    public void buildEnergySource() {
        this.energySource = new EnergySource(5, "battery");
    }

    @Override
    public void buildCorpse(String corpseColor, String corpseMaterial) {
        this.corpse = new Corpse(corpseMaterial, corpseColor);
    }

    @Override
    public void buildSound() {
        this.alarmSound = "beep-beep";
    }



}
