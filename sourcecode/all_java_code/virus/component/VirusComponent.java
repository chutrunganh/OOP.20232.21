package all_java_code.virus.component;

import all_java_code.virus.Displayable;

/**
 * This is the abstract class for all virus components, which is then extended by Capsid, NuclearAcid, and Envelope classes.
 */

public abstract class VirusComponent implements Displayable {

    private String componentName;

    public VirusComponent(String componentName) {
        this.componentName = componentName;
    }

    //  Just provides the name of the component
    public String getComponentName() {
        return componentName;
    }

    @Override
    // Will be used by subclasses to provide details about the component instead of just the name
    public String getDetails() {
        return "component: " + componentName;
    }

    @Override
    public String getImagePath() {
        // Blank method as components don't have images
        return "";
    }

}
