import bus.Bus;
import bus.passangers.Passangers;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Bus bus = new Bus(30);
        bus.addPassanger(new Passangers[]{new Passangers("Raatbek1",15),new Passangers("Raatbek2",15),new Passangers("Raatbek3",15),new Passangers("Raatbek4",15)});
        bus.searchPassanger();
        bus.showPassenger();
        bus.calculate();






    }

}
