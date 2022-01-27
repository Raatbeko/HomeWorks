package AirPort.Management;

import AirPort.Aircraft;
import AirPort.Flight;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

public interface Management {

    void addFlight( Flight flight) throws IOException;

    void showRace();

    void findRace(String name);

}