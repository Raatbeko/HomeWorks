import MyLaptop.Laptop;
import MyLaptop.specification.*;

public class Main {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_WHITE = "\u001B[37m";
    public static final String ANSI_BLACK = "\u001B[30m";

    public static void main(String[] args) {
        laptop();
        display();
        hddOrSdd();
        ram();
        usbPort();
        keyboard();

    }
    public static void laptop(){

        System.out.print("Device name     ");
        Laptop dell = new Laptop("  DELL latitude-5400");
        System.out.println(ANSI_WHITE+dell.getDell()+ANSI_RESET);


    }
    public static void display(){
        System.out.print("Display          ");
        Display display = new Display(" 14.7","FullHD/IPs");
        System.out.println(ANSI_WHITE+display.getSizeDisplay() + display.getModelDisplay()+ANSI_RESET);

    }
    public  static void hddOrSdd(){
        System.out.print("Storage device   ");
        HddOrSdd sdd = new HddOrSdd(" SSD","-256");
        System.out.println(ANSI_WHITE+sdd.getHddOrSdd() + sdd.getSize()+ANSI_RESET);

    }
    public static void ram(){
        System.out.print("Installed RAM     ");
        RAM gb16 = new RAM(16);
        System.out.println(ANSI_WHITE+gb16.getRam()+ANSI_RESET);

    }
    public static void usbPort(){
        System.out.print("USB ports         ");
        USBport usb = new USBport("USB-A 3.thing");
        System.out.print(ANSI_WHITE+usb.getUsbPort()+ANSI_RESET);
        usb.setUsbPort(",HDMI 1.thing");
        System.out.print(ANSI_WHITE+usb.getUsbPort()+ANSI_RESET);
        usb.setUsbPort(",USB-C 1.thing");
        System.out.println(ANSI_WHITE+usb.getUsbPort()+ANSI_RESET);

    }
    public static void keyboard(){
        System.out.print("Keyboard          ");
        Keyboard keyboard = new Keyboard("English, ",true,", Color: White");
        System.out.println(ANSI_WHITE+keyboard.getLanguageInKeyboard() + keyboard.isLightYesOrNot() + keyboard.getLight()+ANSI_RESET);
    }


}