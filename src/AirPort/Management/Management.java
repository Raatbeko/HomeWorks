package AirPort.Management;

import AirPort.Aircraft;
import AirPort.Flight;

import java.util.List;

public interface Management {

    void addFlight( Flight flight);

    void showRace();

    void findRace(String name);

}