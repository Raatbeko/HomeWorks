package MyLaptop.specification;

public class RAM {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_WHITE = "\u001B[37m";
    private double ram;

    public RAM() {
    }

    public RAM(double ram) {
        this.ram = ram;
    }

    public double getRam() {
        return ram;
    }

    public void setRam(double ram) {
        this.ram = ram;
    }

    @Override
    public String toString() {
        return "Installed RAM     " + ANSI_WHITE + ram + "gb" + ANSI_RESET;
    }
}
