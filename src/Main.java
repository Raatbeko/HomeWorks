import MyLaptop.Laptop;
import MyLaptop.User.Users;
import MyLaptop.specification.*;

public class Main {

    public static void main(String[] args) {
        laptop();


    }
    public static void laptop(){

        String[] ports = {"USB-A 3.thing",",HDMI 1.thing",",USB-C 1.thing"};

        Display dispaly = new Display(" 14.7","FullHD/IPs");

        HddOrSdd sdd = new HddOrSdd(" SSD","-256");

        RAM ram = new RAM(16);

        USBport port = new USBport("USB-A 3.thing ,HDMI 1.thing ,USB-C 1.thing");

        Keyboard klavish = new Keyboard("English, ",true,": White");
        Users users  = new Users("Jumabekov Raatbek","jumabekovradik@gmail.com",12,".........",true);

        Laptop laptop = new Laptop("DELL latitude-5400",dispaly,sdd,ram,port,klavish,users);

        System.out.println(laptop);
        System.out.println("---------------------"+"\nUser");
        System.out.println(laptop.getUsers());



    }
}