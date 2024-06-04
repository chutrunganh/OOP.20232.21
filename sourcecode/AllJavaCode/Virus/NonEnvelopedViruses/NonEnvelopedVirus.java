package AllJavaCode.Virus.NonEnvelopedViruses;

import AllJavaCode.Virus.Virus;

/**
 * Class for non-enveloped viruses
 */
public class NonEnvelopedVirus extends Virus {
    
    public NonEnvelopedVirus(String name, String nucleicAcidType, String capsidShape, String shape, float size) {
        super(name, nucleicAcidType, capsidShape, shape, size);
    }

    @Override
    /*
    Virus without envelop will dissolve its capsid when reach the target cell
     */
    public String getInfectionDescription() {
        return "Infection mechanism: The " + getName() + " virus will dissolve its " + getCapsid().getShape() +  " capsid when reaching the target cell.";
    }

    @Override
    public String getImagePath() {
        return super.getImagePath() + "NonEnvelopedViruses/"; //Move to Image/NonEnvelopedViruses/ folder
    }

    @Override
    public String getInfectionVideoPath() {
        return super.getInfectionVideoPath() + "NonEnvelopedViruses/"; // Move to Video/NonEnvelopedViruses/ folder
    }

}