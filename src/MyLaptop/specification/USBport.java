package MyLaptop.specification;

public class USBport {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_WHITE = "\u001B[37m";
    private String usbPort;

    public USBport(String usbPort) {
        this.usbPort = usbPort;
    }

    public String getUsbPort() {
        return usbPort;
    }

    public void setUsbPort(String usbPort) {
        this.usbPort = usbPort;
    }

    @Override
    public String toString() {
        return "USB ports         " + ANSI_WHITE + usbPort + ANSI_RESET ;
    }
}
