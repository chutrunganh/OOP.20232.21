package application.demonstration.virus.component;

import application.demonstration.virus.Displayable;

public abstract class VirusComponent implements Displayable {

    private String name;

    public VirusComponent(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String getImagePath() {
        // blank method as components don't have images
        return "";
    }
    
    @Override
    public String getDetails() {
        StringBuilder sb = new StringBuilder();
        sb.append(getName());
        sb.append(":\n");
        sb.append(getSpecifications());
        sb.append("\n\tFunctions: ");
        sb.append(getFunctionalities());
        return sb.toString();
    }

    public abstract String getSpecifications();
    public abstract String getFunctionalities();
}
