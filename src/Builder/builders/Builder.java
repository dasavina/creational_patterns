package Builder.builders;

import Builder.components.*;

public interface Builder {
    void buildDisplay(String displayColor);
    void buildDetails();
    void buildEnergySource();
    void buildCorpse(String corpseMaterial, String corpseColor);
    void buildSound();
}
