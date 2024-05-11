package AllJavaCode.Structure.AbstractVirus;

// Abstract Virus class
public abstract class Virus implements Infecting{

    // Virus attributes
    public String virusName;
    public String acidNucleic;
    public String capsid;
    public float size;
    public String shape;
    public  String imagePath;


    // Virus constructor
    public Virus(String virusName, String acidNucleic, String capsid, float size, String shape, String image) {
        this.virusName = virusName;
        this.acidNucleic = acidNucleic;
        this.capsid = capsid;
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