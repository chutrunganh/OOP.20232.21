package AllJavaCode.virus;

public class NonEnvelopedVirus extends Virus {
    
    public NonEnvelopedVirus(String name, String acidNucleicType, String capsidShape, String shape, float size) {
        super(name, acidNucleicType, capsidShape, shape, size);
    }

    @Override
    public String showInfectionInText() {
        return "infection in text";
    }

    @Override
    public void showInfectionInVideo() {
        System.out.println("Non Enveloped Virus infection in video");
    }

    @Override
    public String getImagePath() {
        return "sourcecode/src/AllJavaCode/gui/image/NonEnvelopedVirus/" + getName();
    }
}