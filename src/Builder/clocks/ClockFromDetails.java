package Builder.clocks;

import Builder.components.*;

public abstract class ClockFromDetails {
    private Display display;
    private Details details;
    private EnergySource energySource;
    private Corpse corpse;

    public ClockFromDetails(Display display, Details details, EnergySource energySource, Corpse corpse) {
        this.display = display;
        this.details = details;
        this.energySource = energySource;
        this.corpse = corpse;
    }

    public Display getDisplay() {
        return display;
    }

    public Details getDetails() {
        return details;
    }

    public EnergySource getEnergySource() {
        return energySource;
    }

    public Corpse getCorpse() {
        return corpse;
    }

    @Override
    public String toString() {
        return "ClockFromDetails{" +
                "display=" + display +
                ", details=" + details +
                ", energySource=" + energySource +
                ", corpse=" + corpse +
                '}';
    }
}