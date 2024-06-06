package application.demonstration.virus.nonenveloped;

import application.demonstration.virus.Virus;

public abstract class NonEnvelopedVirus extends Virus {
    
    public NonEnvelopedVirus(String name, String nucleicAcidType, String capsidShape, String shape, float size) {
        super(name, nucleicAcidType, capsidShape, shape, size);
    }

    // Virus without envelop will dissolve its capsid when reach the target cell
    @Override
    public String getInfectionMechanism() {
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

    // Extends addresses to directories of medias for non-enveloped viruses
    @Override
    public String getInfectionVideoPath() {
        return super.getInfectionVideoPath() + "NonEnvelopedViruses/";
    }

    @Override
    public String getImagePath() {
        return super.getImagePath() + "NonEnvelopedViruses/";
    }
}