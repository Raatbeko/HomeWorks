package settlements;

import java.util.Set;

public class City extends SettlementsAbstract {
    private Region[] region;

    public City(String name, int count, Supervisor supervisor, Region[] region) {
        super(name, count, supervisor);
        this.region = region;
    }
   }

