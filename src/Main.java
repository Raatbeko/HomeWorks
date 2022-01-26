import AirPort.Aircraft;
import AirPort.Boing;
import AirPort.Flight;
import AirPort.Management.AirportManagement;
import AirPort.Tu154;

import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Main {
    public static void main(String[] args) throws Exception {
        File file = new File("Flights_plan.txt");
        FileOutputStream fos = new FileOutputStream(file);

        Aircraft boimg = new Boing("Wars");
        Aircraft T189 = new Tu154("Relax");
        System.out.println(T189);
        List<Flight> flightArrays = new ArrayList<>();

        Flight fligh1 = new Flight("12:00","18:30",T189,"Good",fos);
        Flight fligh2 = new Flight("14:00","15:30",boimg,"Good",fos);
        Flight fligh3 = new Flight("1:00","17:30",boimg,"Good",fos);
        Flight fligh4 = new Flight("13:00","15:30",T189,"Good",fos);
        flightArrays.add(fligh1);
        flightArrays.add(fligh2);
        flightArrays.add(fligh3);
        flightArrays.add(fligh4);

        AirportManagement airportManagement = new AirportManagement(flightArrays);
        airportManagement.addFlight(new Flight("234523","15:30",T189,"Good",fos));
        airportManagement.findRace("Wars");

    }

}
