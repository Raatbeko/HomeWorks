package MyLaptop.specification;

public class Display {
    private String sizeDisplay;
    private String modelDisplay;

    public Display() {

    }

    public Display(String sizeDisplay, String modelDisplay) {
        this.sizeDisplay = sizeDisplay;
        this.modelDisplay = modelDisplay;

    }

    public String getModelDisplay() {
        return modelDisplay;
    }

    public void setModelDisplay(String modelDisplay) {
        this.modelDisplay = modelDisplay;
    }

    public String getSizeDisplay() {
        return sizeDisplay;
    }

    public void setSizeDisplay(String sizeDisplay) {
        this.sizeDisplay = sizeDisplay;
    }

}
