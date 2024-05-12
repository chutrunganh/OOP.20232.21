package AllJavaCode.Structure.AbstractVirus;
// NonEnvelopedVirus class

public class NonEnvelopedVirus extends Virus {
    

    // EnvelopedVirus constructor
    public NonEnvelopedVirus(String virusName, String acidNucleic, String capsid, float size, String shape, String image) {
        super(virusName, acidNucleic, capsid, size, shape, image);
    }

    // NonEnvelopedVirus methods

    @Override
    public String toString() {
        String virusInfo = super.toString();
        return virusInfo;
    }

    @Override
    public String showInfectionInText() {
        return "Virus" + virusName + " infection by this mechanism: when reaching the target, it dissolve its capsid "  + capsid + " to release its acid nucleic " + acidNucleic + " into the host cell";
    }

    public void showInfectionInVideo() {
        System.out.println("Non Enveloped Virus infection in video");
    }

}