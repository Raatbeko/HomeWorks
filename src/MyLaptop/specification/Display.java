package MyLaptop.specification;

public class Display {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_WHITE = "\u001B[37m";
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

    @Override
    public String toString() {
        return "Display          " + ANSI_WHITE +sizeDisplay + "," + modelDisplay + ANSI_RESET;
    }
}
