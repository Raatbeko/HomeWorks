import Animals.AbsAnimal;
import Animals.exAnima.Dog;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<AbsAnimal> dalmatian = new LinkedHashSet<>();
        for (int i = 1;i<=40;i++){
            dalmatian.add(new Dog("Долмотинец №"+i,i));
        }
        System.out.println(dalmatian);
    }

}
