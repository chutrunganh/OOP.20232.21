package AllJavaCode.Structure;
// EnvelopedVirus class

public class EnvelopedVirus extends Virus {
    
    // EnvelopedVirus attributes
    public String enveloped;
    

    // EnvelopedVirus constructor
    public EnvelopedVirus(String virusName, String acidNucleic, String capsid, float size, String shape, String image, String enveloped, String glycoprotein) {
        super(virusName, acidNucleic, capsid, size, shape, image);
        this.enveloped = enveloped;
    }

    // EnvelopedVirus methods
    @Override

    public String toString() {
        super.toString();
        System.out.println("Enveloped: " + enveloped);
        return "";
    }
}