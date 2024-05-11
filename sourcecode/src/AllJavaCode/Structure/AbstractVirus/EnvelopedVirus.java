package AllJavaCode.Structure.AbstractVirus;

public class EnvelopedVirus extends Virus {
    public String enveloped;
    public String glycoprotein;

    // EnvelopedVirus constructor
    public EnvelopedVirus(String virusName, String acidNucleic, String capsid, float size, String shape, String image, String enveloped, String glycoprotein) {
        super(virusName, acidNucleic, capsid, size, shape, image);
        this.enveloped = enveloped;
        this.glycoprotein = glycoprotein;
    }

    // EnvelopedVirus methods
    @Override
    public String toString() {
        String virusInfo = super.toString() + "Enveloped: " + enveloped + "\n" + "Glycoprotein: " + glycoprotein + "\n";
        return virusInfo ;
    }

    @Override
    public String showInfectionInText() {
        return "Virus" + virusName + " infection by this mechanism: when reaching the host with the suitable outer structure, it uses its glycoprotein " + glycoprotein + " to attach to attach, then inject its acid nucleic " + acidNucleic + " into the host cell";
    }

    public void showInfectionInVideo() {
        System.out.println("Enveloped Virus infection in video");
    }

    
}