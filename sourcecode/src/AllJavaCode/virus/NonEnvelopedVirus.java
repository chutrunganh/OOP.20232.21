package AllJavaCode.virus;
// NonEnvelopedVirus class

public abstract class NonEnvelopedVirus extends Virus {
    
    public NonEnvelopedVirus() {}
    public NonEnvelopedVirus(String virusName, float size, String shape, String image) {
        super(virusName, size, shape, image);
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