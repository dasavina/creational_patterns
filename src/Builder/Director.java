package Builder;

import Builder.builders.Builder;
import Builder.components.Corpse;
import Builder.components.Details;
import Builder.components.Display;
import Builder.components.EnergySource;

public class Director {
    public void buildDigitalClock(Builder builder)
    {
        builder.buildDetails(new Details("electronic"));
        builder.buildEnergySource(new EnergySource(5, "battery"));
        builder.buildCorpse (new Corpse("plastic", "black"));
        builder.buildDisplay(new Display("digital", "black"));
        builder.buildSound("beep-beep");
    }

    public void buildMechanicalClock(Builder builder, String displayColor, String corpseColor, String corpseMaterial)
    {
        builder.buildDetails(new Details("mechanical"));
        builder.buildEnergySource(new EnergySource(5, "hairspring"));
        builder.buildCorpse(new Corpse("metal", "silver"));
        builder.buildDisplay(new Display("analogue", "white"));
        builder.buildSound("tick-tock");
    }

}
