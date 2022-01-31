import java.util.Scanner;

public class Calculate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean controller = true;
        while (true) {
            System.out.println("choose: + , -, *, /");
            String functional = sc.next();

            System.out.print("Type first number-> ");
            int num1 = sc.nextInt();

            System.out.print("Type second number-> ");
            int num2 = sc.nextInt();
            try {
                System.out.println(calculate(functional, num1, num2));

            } catch (ArithmeticException e) {
                        System.out.println("делить на ноль нельзя");
            }
        }
    }

    public static int calculate(String functional, int num1, int num2) {

        switch (functional) {
            case "+":
                return num1 + num2;

            case "-":
                return num1 - num2;

            case "*":
                return num1 * num2;

            case "/":
                return num1 / num2;

        }
        return 0;
    }
}
