package MyLaptop;

import MyLaptop.User.Users;
import MyLaptop.specification.*;

public class Laptop {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_WHITE = "\u001B[37m";

    private Display display;
    private String name;
    private HddOrSdd ssd;
    private RAM ram;
    private USBport ports;
    private Keyboard kalvish;
    private Users users;

    public Laptop() {
    }

    public Laptop(String name, Display display, HddOrSdd ssd, RAM ram, USBport ports, Keyboard kalvish, Users users) {
        this.display = display;
        this.name = name;
        this.ssd = ssd;
        this.ram = ram;
        this.ports = ports;
        this.kalvish = kalvish;
        this.users = users;
    }

    public Laptop(Users users) {
        this.users = users;
    }

    public Laptop(Display display) {
        this.display = display;
    }

    public Display getDisplay() {
        return display;
    }

    public void setDisplay(Display display) {
        this.display = display;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public HddOrSdd getSsd() {
        return ssd;
    }

    public void setSsd(HddOrSdd ssd) {
        this.ssd = ssd;
    }

    public RAM getRam() {
        return ram;
    }

    public void setRam(RAM ram) {
        this.ram = ram;
    }

    public USBport getPorts() {
        return ports;
    }

    public void setPorts(USBport ports) {
        this.ports = ports;
    }

    public Keyboard getKalvish() {
        return kalvish;
    }

    public void setKalvish(Keyboard kalvish) {
        this.kalvish = kalvish;
    }

    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }

    @Override
    public String toString() {
        return "Device name       " + ANSI_WHITE + name + ANSI_RESET + "\n" + display + "\n" + ram + "\n" + ssd + "\n" + ports + "\n" + kalvish ;//+ "\n" + users;
    }
}
