package all_java_code.virus.non_enveloped_viruses;

import all_java_code.virus.Virus;

/**
 * Class for non-enveloped viruses
 */
public class NonEnvelopedVirus extends Virus {
    
    public NonEnvelopedVirus(String name, String nucleicAcidType, String capsidShape, String shape, float size) {
        super(name, nucleicAcidType, capsidShape, shape, size);
    }

    @Override
    /*
    virus without envelop will dissolve its capsid when reach the target cell
     */
    public String getInfectionDescription() {
        return "Infection mechanism: The " + getName() + " virus will dissolve its " + getCapsid().getShape() +  " capsid when reaching the target cell.";
    }

    @Override
    public String getImagePath() {
        return super.getImagePath() + "non_enveloped_viruses/"; //Move to image/non_enveloped_viruses/ folder
    }

    @Override
    public String getInfectionVideoPath() {
        return super.getInfectionVideoPath() + "non_enveloped_viruses/"; // Move to video/non_enveloped_viruses/ folder
    }

}