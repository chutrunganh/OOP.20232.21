package AllJavaCode.virus.nonenveloped;

import AllJavaCode.virus.Virus;

public class NonEnvelopedVirus extends Virus {
    
    public NonEnvelopedVirus(String name, String nucleicAcidType, String capsidShape, String shape, float size) {
        super(name, nucleicAcidType, capsidShape, shape, size);
    }

    // Virus without envelop will dissolve its capsid when reach the target cell
    @Override
    public String getInfectionDescription() {
        StringBuilder sb = new StringBuilder();
        sb.append("Infection mechanism: ");
        sb.append(getName());
        sb.append(" will dissolve its ");
        sb.append(getCapsid().getShape());
        sb.append(" capsid when reaching its target cell and its ");
        sb.append(getNucleicAcid().getType());
        sb.append(" will enter the host cell.");
        return sb.toString();
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