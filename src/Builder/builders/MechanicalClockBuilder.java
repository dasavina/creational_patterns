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
    public ClockFromDetails getResult()
    {
        return new MechanicalClock(display, details, energySource, corpse, tickingSound);
    }

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
        this.tickingSound = sound;
    }
}
