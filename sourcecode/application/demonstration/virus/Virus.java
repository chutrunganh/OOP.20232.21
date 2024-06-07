package application.demonstration.virus;

import application.demonstration.virus.component.Capsid;
import application.demonstration.virus.component.NucleicAcid;

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
        sb.append(getName());
        sb.append("\nShape: ");
        sb.append(getShape());
        sb.append("\nSize: ");
        sb.append(getSize()); // + length unit
        sb.append(" micrometers");
        return sb.toString();
    }

    // Address to image directory
    @Override
    public String getImagePath() {
        return "image/";
    }

    // Address to video directory
    @Override
    public String getInfectionVideoPath() {
        return "video/";
    }
}