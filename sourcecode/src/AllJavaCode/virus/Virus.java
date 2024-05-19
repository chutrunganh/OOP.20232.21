package AllJavaCode.virus;

import AllJavaCode.virus.component.AcidNucleic;
import AllJavaCode.virus.component.Capsid;

public abstract class Virus implements Infectable {

    private String name;
    private AcidNucleic acidNucleic;
    private Capsid capsid;
    private String shape; // linear, circular, segmented
    private float size;
    
    public Virus(String name, String acidNucleicType, String capsidShape, String shape, float size) {
        this.name = name;
        this.acidNucleic = new AcidNucleic(acidNucleicType);
        this.capsid = new Capsid(capsidShape);
        this.shape = shape;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public String getShape() {
        return shape;
    }

    public float getSize() {
        return size;
    }

    public String getAcidNucleic() {
        return acidNucleic.toString();
    }

    public String getCapsid() {
        return capsid.toString();
    }

    public abstract String getImagePath();
}