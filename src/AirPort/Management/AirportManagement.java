package AirPort.Management;

import AirPort.Flight;

import java.util.List;

public class AirportManagement implements Management {
    List<Flight> flights;

    public AirportManagement(List<Flight> flights) {
        this.flights = flights;
    }

    @Override
    public void addFlight(Flight flight) {
        flights.add(flight);
    }

    @Override
    public void showRace() {
        System.out.println(flights);
    }

    @Override
    public void findRace(String name) {
        for (Flight flight : flights) {
            if (name.equalsIgnoreCase(flight.aircraft())) {
                System.out.println(flight);
            }
        }
    }

    public List<Flight> getFlights() {
        return flights;
    }

    public void setFlights(List<Flight> flights) {
        this.flights = flights;
    }
}
