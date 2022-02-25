package Function;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Function {
    public Set<Character> setOfNumber(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Type number-> ");
        String number = scanner.next();

        Set<Character> setOfNumber = new HashSet<>();

        for (int i = 0; i < number.length(); i++) {
            if (number.charAt(i) == ','){
                continue;
            }
            setOfNumber.add(number.charAt(i));
        }
        return setOfNumber;
    }
}
