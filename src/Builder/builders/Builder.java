package Builder.builders;

import Builder.components.*;

public interface Builder {
    void buildDisplay(Display display);
    void buildDetails(Details details);
    void buildEnergySource(EnergySource energySource);
    void buildCorpse(Corpse corpse);
    void buildSound(String sound);
}
