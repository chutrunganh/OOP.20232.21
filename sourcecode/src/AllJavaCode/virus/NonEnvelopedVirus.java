package AllJavaCode.virus;
// NonEnvelopedVirus class

public class NonEnvelopedVirus extends Virus {
    
    public NonEnvelopedVirus() {
        super();
    }

    public NonEnvelopedVirus(String virusName, float size, String shape, String image) {
        super(virusName, size, shape, image);
    }

    // NonEnvelopedVirus methods

    @Override
    public String showInfectionInText() {
        return "Virus" + name + " infection by this mechanism: when reaching the target, it dissolve its capsid "  + capsid + " to release its acid nucleic " + acidNucleic + " into the host cell";
    }

    public void showInfectionInVideo() {
        System.out.println("Non Enveloped Virus infection in video");
    }

}