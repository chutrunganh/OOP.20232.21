package AllJavaCode.Virus;

import AllJavaCode.Virus.Component.Capsid;
import AllJavaCode.Virus.Component.NucleicAcid;

/**
 * Abstract class for a virus which include name, nucleic acid, capsid, shape, and size
 * A virus will not have the imagePath and videoPath attributes since we name the image and video by the virus name, then use virus name to get the path
 */
public abstract class Virus implements Infectable, Displayable {

    private String name;
    private NucleicAcid nucleicAcid;
    private Capsid capsid;
    private String shape; // linear, circular, segmented
    private float size;
    
    public Virus(String name, String nucleicAcidType, String capsidShape, String shape, float size) {
        this.name = name;
        this.nucleicAcid = new NucleicAcid(nucleicAcidType);
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

    public NucleicAcid getNucleicAcid() {
        return nucleicAcid;
    }

    public Capsid getCapsid() {
        return capsid;
    }

    @Override
    public String getDetails() {
        StringBuilder sb = new StringBuilder();
        sb.append("Virus name: ");
        sb.append(name);
        sb.append("\nShape: ");
        sb.append(shape);
        sb.append("\nSize: ");
        sb.append(size); // + length unit
        sb.append(" micrometers");
        return sb.toString();
    }
    @Override
    public String getImagePath() {
        return "Image/";
    } //Move to folder Image

    @Override
    public String getInfectionVideoPath() {
        return "Video/";
    } //Move to folder Video

    //Infected description is dependent on the virus type so not implemented here
}