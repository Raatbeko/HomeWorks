package AirPort.Management;

import AirPort.Flight;
import java.io.*;
import java.util.Arrays;

public class AirportManagement implements Management {
    Flight[] flights;
    File file = new File("flights_plan.txt");

    public AirportManagement(Flight[] flights) {
        this.flights = flights;
    }

    @Override
    public void addFlight(Flight flight) throws IOException {

        if (flights[flights.length-1] == null) {
            for (int i = 0; i < flights.length; i++) {
                if (flights[i] == null) {
                    flights[i] = flight;
                }
            }
        }else{
            System.out.println("Not have place!");
        }
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        fileOutputStream.write(Arrays.toString(flights).getBytes());

    }

    @Override
    public void showRace() {
        System.out.println(Arrays.toString(flights));
    }

    @Override
    public void findRace(String name) {

            for (Flight flight : flights) {
                if (name.equalsIgnoreCase(flight.getAircraft().getType())) {
                    System.out.println(flight);
                }
            }

    }

    public Flight[] getFlights() {
        return flights;
    }

    public void setFlights(Flight[] flights) {
        this.flights = flights;
    }
}
