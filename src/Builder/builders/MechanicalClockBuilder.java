package Builder.builders;

import Builder.clocks.ClockFromDetails;
import Builder.clocks.MechanicalClock;
import Builder.components.Corpse;
import Builder.components.Details;
import Builder.components.Display;
import Builder.components.EnergySource;

public class MechanicalClockBuilder implements Builder{
    private Display display;
    private Details details;
    private EnergySource energySource;
    private Corpse corpse;
    private String tickingSound;

    public  MechanicalClock buildClock(String displayColor, String corpseMaterial, String corpseColor)
    {
        buildDetails();
        buildEnergySource();
        buildCorpse(corpseColor, corpseMaterial);
        buildDisplay(displayColor);
        buildSound();
        return new MechanicalClock(display, details, energySource, corpse, tickingSound);
    }

    @Override
    public void buildDisplay(String displayColor) {
        this.display = new Display("analogue", displayColor);
    }

    @Override
    public void buildDetails() {
        this.details = new Details("mechanical");
    }

    @Override
    public void buildEnergySource() {
        this.energySource = new EnergySource(5, "hairspring");
    }

    @Override
    public void buildCorpse(String corpseColor, String corpseMaterial) {
        this.corpse = new Corpse(corpseMaterial, corpseColor);
    }

    @Override
    public void buildSound() {
        this.tickingSound = "tick-tock";
    }
}
