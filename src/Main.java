import settlements.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Supervisor> journalSupervisors = new ArrayList<>();
        journalSupervisors.add(new Supervisor("Sapar",4));
        journalSupervisors.add(new Supervisor("Kapar",4));
        journalSupervisors.add(new Supervisor("Tumar",4));
        journalSupervisors.add(new Supervisor("Murat",4));
        journalSupervisors.add(new Supervisor("Kumar",4));

        SettlementsAbstract City = new City("Bish",1000_000, journalSupervisors.get(3), new Region[]{new Region("Tokmok",10000,journalSupervisors.get(0)),new Region("Suzak",10000, journalSupervisors.get(2)),new Region("Minsk",10000, journalSupervisors.get(1))});
        Village Village = new Village("SMU",1000, journalSupervisors.get(4));
    }
    public static void searchByLeaders(List<Supervisor> supervisors ,String name){
        for (Supervisor supervisor : supervisors) {
            if (supervisor.getName().equals(name)){
                System.out.println(supervisor);
            }
        }
    }
}
