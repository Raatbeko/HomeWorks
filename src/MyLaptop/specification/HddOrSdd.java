package MyLaptop.specification;

public class HddOrSdd {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_WHITE = "\u001B[37m";
    private String hddOrSdd;
    private String size;

    public HddOrSdd() {
    }

    public HddOrSdd(String hddOrSdd, String s) {
        this.hddOrSdd = hddOrSdd;
        this.size = s;

    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getHddOrSdd() {
        return hddOrSdd;
    }

    public void setHddOrSdd(String hddOrSdd) {
        this.hddOrSdd = hddOrSdd;
    }

    @Override
    public String toString() {
        return "Storage device   " + ANSI_WHITE + hddOrSdd + "," + size + ANSI_RESET;
    }
}
