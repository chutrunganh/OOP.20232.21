package AllJavaCode.virus.component;

import AllJavaCode.virus.Displayable;

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
        return "Component: " + name;
    }
}
