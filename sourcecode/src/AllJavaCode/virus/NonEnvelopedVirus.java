package AllJavaCode.virus;

public class NonEnvelopedVirus extends Virus {
    
    public NonEnvelopedVirus(String name, String nucleicAcidType, String capsidShape, String shape, float size) {
        super(name, nucleicAcidType, capsidShape, shape, size);
    }

    @Override
    public String showInfectionDescription() {
        return "infection in text";
    }

    @Override
    public void showInfectionVideo() {
        System.out.println("Non Enveloped Virus infection in video");
    }

    @Override
    public String getImagePath() {
        return super.getImagePath() + "NonEnvelopedViruses/";
    }
}