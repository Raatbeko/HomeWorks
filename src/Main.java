import Enums.Aweek;

import java.lang.invoke.SwitchPoint;
import java.util.Calendar;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        try {
            Aweek aweek = Aweek.valueOf(name);
            translateOfWeek(aweek);
        } catch (IllegalArgumentException e) {
            System.out.println("error");
        }

    }

    public static void translateOfWeek(Aweek aweek) {


        switch (aweek) {
            case Monday:
                System.out.println(Aweek.Monday.getOnRussian());
                break;
            case Tuesday:
                System.out.println(Aweek.Tuesday.getOnRussian());
                break;
            case Wednesday:
                System.out.println(Aweek.Wednesday.getOnRussian());
                break;
            case Thursday:
                System.out.println(Aweek.Thursday.getOnRussian());
                break;
            case Friday:
                System.out.println(Aweek.Friday.getOnRussian());
                break;
            case Saturday:
                System.out.println(Aweek.Saturday.getOnRussian());
                break;
            case Sunday:
                System.out.println(Aweek.Sunday.getOnRussian());
                break;
            default:
                System.out.println("You made a mistake!!!");
        }
    }

    public static int calculate(char functional, int num1, int num2) {

        switch (functional) {
            case '+':
                return num1 + num2;

            case '-':
                return num1 - num2;

            case '*':
                return num1 * num2;

            case '/':
                return num1 / num2;

        }
        return 0;
    }


}
