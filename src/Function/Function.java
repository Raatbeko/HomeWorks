package Function;

import java.util.HashSet;
import java.util.Locale;
import java.util.Scanner;
import java.util.Set;

public class Function {
    public Set<Character> setOfNumber() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Type number-> ");
        String number = scanner.next();

        Set<Character> setOfNumbers = new HashSet<>();
        number = number.toLowerCase(Locale.ROOT);

        boolean controle = true;
        for (int i = 0; i < number.length(); i++) {
            for (char j = 'a'; j < 'z'; j++) {
                if (number.charAt(i) == j) {
                    System.out.println("Вести только число!!");
                    return null;
                }
            }
            if (number.charAt(i) == ',') {
                continue;
            }
            setOfNumbers.add(number.charAt(i));
            controle = false;
        }
        return setOfNumbers;
    }
}

