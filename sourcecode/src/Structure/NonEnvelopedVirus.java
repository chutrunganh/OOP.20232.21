package Structure;
// NonEnvelopedVirus class

public class NonEnvelopedVirus extends Virus {
    

    // EnvelopedVirus constructor
    public NonEnvelopedVirus(String virusName, String acidNucleic, String capsid, float size, String shape, String image) {
        super(virusName, acidNucleic, capsid, size, shape, image);
    }

    // NonEnvelopedVirus methods

    @Override
    public String toString() {
        super.toString();
        return "";
    }

}