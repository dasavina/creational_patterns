package Builder.clocks;

import Builder.components.Corpse;
import Builder.components.Details;
import Builder.components.Display;
import Builder.components.EnergySource;

public class MechanicalClock extends ClockFromDetails{
    String tickingSound;
    public MechanicalClock(Display display, Details details, EnergySource energySource, Corpse corpse, String tickingSound) {
        super(display, details, energySource, corpse);
        this.tickingSound = tickingSound;
    }

    public String getTickingSound() {
        return tickingSound;
    }

    @Override
    public String toString() {
        return (super.toString() +
                "\ntickingSound='" + tickingSound);
    }
}
