import MyLaptop.Laptop;
import MyLaptop.specification.*;

public class Main {
    public void main(String[] args) {
        this.laptop();
        this.display();
        this.hddOrSdd();

    }
    public void laptop(){
        Laptop dell = new Laptop("\"DELL latitude-5400\"");
        System.out.println(dell.getDell());
        System.out.println();

    }
    public void display(){
        Display display = new Display("14.7","FullHD/IPs");
        System.out.println("Display:");
        System.out.println(display.getSizeDisplay()+ "\n" + display.getModelDisplay());

    }
    public void hddOrSdd(){
//        System.out.print("Storage device:");
        HddOrSdd sdd = new HddOrSdd("SSD","-256");
        System.out.println(sdd.getHddOrSdd() + sdd.getHddOrSdd());

    }
    public void ram(){
        RAM gb16 = new RAM(16);
        System.out.println(gb16.getRam());

    }
    public void usbPort(){
        USBport usb = new USBport("USB-A 3.thing");
        System.out.print(usb.getUsbPort());
        usb.setUsbPort(",HDMI 1.thing");
        System.out.println(usb.getUsbPort());
        usb.setUsbPort(",USB-C 1.thing");
        System.out.println(usb.getUsbPort());

    }
    public void keyboard(){
        Keyboard keyboard = new Keyboard("English, ",true,", Color: White");
        System.out.println(keyboard.getLanguageInKeyboard() + keyboard.isLightYesOrNot() + keyboard.getLight());
    }


}
