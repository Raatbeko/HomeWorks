package MyLaptop.specification;

public class HddOrSdd {
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
}
