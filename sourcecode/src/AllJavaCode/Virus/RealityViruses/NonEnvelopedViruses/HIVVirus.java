package AllJavaCode.Virus.RealityViruses.NonEnvelopedViruses;

import AllJavaCode.Virus.AbstractVirus.EnvelopedVirus;

public class HIVVirus extends EnvelopedVirus {
    
    public HIVVirus() {
        super("HIV", "RNA", "Icosahedral",  "Spherical", 0.1f, "GP120");
    }

    @Override
    public String getInfectionVideoPath() {
        return super.getInfectionVideoPath() + getName() + ".mp4";
    }

    @Override
    public String getImagePath() {
        return super.getImagePath() + getName() + ".png";
    }
}