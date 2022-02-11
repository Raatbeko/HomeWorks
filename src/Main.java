import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<AnimalAbstract> animals = new LinkedList<>();

        for (int i = 0; i < 50; ++i) {
            animals.add(new Cat(i));
            animals.add(new Dog(i++));
        }
        System.out.println(animals);

    }

}
