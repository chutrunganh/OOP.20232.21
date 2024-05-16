package AllJavaCode.virus;

import AllJavaCode.virus.component.AcidNucleic;
import AllJavaCode.virus.component.Capsid;

public abstract class Virus implements Infectable {

    public String name;
    public AcidNucleic acidNucleic;
    public Capsid capsid;
    public float size;
    public String shape;
    public String imagePath;


    public Virus() {
        this.acidNucleic = new AcidNucleic();
        this.capsid = new Capsid();
    } // rewrite constructors
    
    public Virus(String name, float size, String shape, String image) {
        this.name = name;
        this.acidNucleic = new AcidNucleic();
        this.capsid = new Capsid();
        this.size = size;
        this.shape = shape;
        this.imagePath = image;
    }
    

    @Override
    public String toString() {
        String virusInfo = "Virus Name: " + name + "\n" + "Acid Nucleic: " + acidNucleic + "\n" + "Capsid: " + capsid + "\n" + "Size: " + size + "\n" + "Shape: " + shape + "\n";
        return virusInfo;
    }

    //Getters and Setters
    public String getImage() {
        return imagePath;
    }
}