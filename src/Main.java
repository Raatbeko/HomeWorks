import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        HashMap<Integer,Car> cars = new HashMap<>();
        cars.put(1,new Car("RangeRower"));
        cars.put(2,new Car("Audy"));
        cars.put(3,new Car("Mers"));
        cars.put(4,new Car("BMW"));
        cars.put(5,new Car("Ford"));
        for (int i = 0; i < cars.size(); i++) {
            System.out.println(cars.get(i+1));
        }
    }

}
