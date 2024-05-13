package AllJavaCode.virus;

import AllJavaCode.virus.component.LipidEnvelop;

public abstract class EnvelopedVirus extends Virus {
    public LipidEnvelop envelop;
    public String glycoprotein; // add Glycoprotein component and change data type

    public EnvelopedVirus() {}
    public EnvelopedVirus(String virusName, float size, String shape, String image, String glycoprotein) {
        super(virusName, size, shape, image);
        this.envelop = new LipidEnvelop();
        this.glycoprotein = glycoprotein; // new Glycoprotein()
    }

    // EnvelopedVirus methods
    @Override
    public String toString() {
        String virusInfo = super.toString() + "Enveloped: " + envelop.toString() + "\n" + "Glycoprotein: " + glycoprotein + "\n";
        return virusInfo ;
    }

    @Override
    public String showInfectionInText() {
        return "Virus" + virusName + " infection by this mechanism: when reaching the host with the suitable outer structure, it uses its glycoprotein " + glycoprotein + " to attach to attach, then inject its acid nucleic " + acidNucleic + " into the host cell";
    }

    public void showInfectionInVideo() {
        System.out.println("Enveloped Virus infection in video");
    }

    // method for dissolving capsid?
}