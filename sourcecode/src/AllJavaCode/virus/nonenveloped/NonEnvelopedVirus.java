package AllJavaCode.virus.nonenveloped;

import AllJavaCode.virus.Virus;

public class NonEnvelopedVirus extends Virus {
    
    public NonEnvelopedVirus(String name, String nucleicAcidType, String capsidShape, String shape, float size) {
        super(name, nucleicAcidType, capsidShape, shape, size);
    }

    @Override
    public String getInfectionDescription() {
        return "infection in text";
    }

    @Override
    public String getInfectionVideoPath() {
        return super.getInfectionVideoPath() + "NonEnvelopedViruses/";
    }

    @Override
    public String getImagePath() {
        return super.getImagePath() + "NonEnvelopedViruses/";
    }
}