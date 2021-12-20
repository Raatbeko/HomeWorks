import bus.Bus;
import bus.passangers.Passangers;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Bus bus = new Bus(30);
        bus.showPassanger(new Passangers[]{new Passangers(1,"Raatbek1",15),new Passangers(2,"Raatbek2",15),new Passangers(3,"Raatbek3",15),new Passangers(4,"Raatbek4",15)});
        bus.addPassenger();
//        bus.searchPassanger();\
        bus.sortsObject();
        bus.calculate();







    }

}
