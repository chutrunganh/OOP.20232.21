package AllJavaCode.virus;

import AllJavaCode.virus.component.LipidEnvelop;
import AllJavaCode.virus.component.Glycoprotein;

public class EnvelopedVirus extends Virus {
    public LipidEnvelop envelop;
    public Glycoprotein glycoprotein; // add Glycoprotein component and change data type

    public EnvelopedVirus() {
        super();
    }

    public EnvelopedVirus(String virusName, float size, String shape, String image) {
        super(virusName, size, shape, image);
        this.envelop = new LipidEnvelop();
        this.glycoprotein = new Glycoprotein(); // new Glycoprotein()
    }

    // EnvelopedVirus methods
    // @Override
    // public String toString() {
    //     String virusInfo = super.toString() + "Enveloped: " + envelop.toString() + "\n" + "Glycoprotein: " + glycoprotein + "\n";
    //     return virusInfo ;
    // }

    @Override
    public String showInfectionInText() {
        return "Virus" + name + " infection by this mechanism: when reaching the host with the suitable outer structure, it uses its glycoprotein " + glycoprotein + " to attach to attach, then inject its acid nucleic " + acidNucleic + " into the host cell";
    }

    public void showInfectionInVideo() {
        System.out.println("Enveloped Virus infection in video");
    }

    // method for dissolving capsid?
}