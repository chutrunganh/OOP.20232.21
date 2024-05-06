package Structure;
// Abstract Virus class
public abstract class Virus {
    
    // Virus attributes
    public String virusName;
    public String acidNucleic;
    public String capsid;
    public float size;
    public String shape;
    public String image;


    // Virus constructor
    public Virus(String virusName, String acidNucleic, String capsid, float size, String shape, String image) {
        this.virusName = virusName;
        this.acidNucleic = acidNucleic;
        this.capsid = capsid;
        this.size = size;
        this.shape = shape;
        this.image = image;
    }
    

    @Override
    public String toString() {
        System.out.println("Virus Name: " + virusName);
        System.out.println("Acid Nucleic: " + acidNucleic);
        System.out.println("Capsid: " + capsid);
        System.out.println("Size: " + size);
        System.out.println("Shape: " + shape);
        System.out.println("Image: " + image);
        return "";
    }
}