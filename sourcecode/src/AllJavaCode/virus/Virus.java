package AllJavaCode.virus;

import AllJavaCode.virus.component.AcidNucleic;
import AllJavaCode.virus.component.Capsid;

public abstract class Virus implements Infectable {

    public String virusName;
    public AcidNucleic acidNucleic;
    public Capsid capsid;
    public float size;
    public String shape;
    public String imagePath;


    public Virus() {} // rewrite constructors
    public Virus(String virusName, float size, String shape, String image) {
        this.virusName = virusName;
        this.acidNucleic = new AcidNucleic();
        this.capsid = new Capsid();
        this.size = size;
        this.shape = shape;
        this.imagePath = image;
    }
    

    @Override
    public String toString() {
        String virusInfo = "Virus Name: " + virusName + "\n" + "Acid Nucleic: " + acidNucleic + "\n" + "Capsid: " + capsid + "\n" + "Size: " + size + "\n" + "Shape: " + shape + "\n";
        return virusInfo;
    }

    //Getters and Setters
    public String getImage() {
        return imagePath;
    }
}