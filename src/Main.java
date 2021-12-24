import java.util.Scanner;
import pizza.LaFinta;
import pizza.Magarita;
import pizza.Peperoni;
import pizza.PizzaStore;

public class Main {

        public static final String ANSI_RESET = "\u001B[0m";
        public static final String ANSI_WHITE = "\u001B[37m";

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            PizzaStore pizzaStore = new PizzaStore();

            int point;
            do {
                System.out.println("Здраствуйте это пиццариа \"PizzaStrore\"!!!\n" +
                        "                  Меню\n" +
                        "             1 . Margarita\n" +
                        "             2 . Lafinta\n" +
                        "             3 . Peperoni\n" +
                        "             0 . Завершить заказ\n" +
                        ANSI_WHITE + "                                              Простите что так мало блюд мы прост не давно открылись!!!" + ANSI_RESET);
                System.out.print(">" + '\t');

                point = scanner.nextInt();
                switch (point) {
                    case 1:
                        Magarita magarita = new Magarita("Cow meat");
                        pizzaStore.setMargarita(magarita, 25);
                        break;
                    case 2:
                        LaFinta laFinta = new LaFinta("just greenery", "Cheese souse");
                        pizzaStore.setLaFinta(laFinta, 25);
                        break;
                    case 3:
                        Peperoni peperoni = new Peperoni("Peperoni");
                        pizzaStore.setPeperoni(peperoni, 25);
                        break;
                    case 0:
                       break;

                }
                if(point != 0) {
                    System.out.println("Будете делать ещё заказ?");
                    String yesOrNot = scanner.next();
                    if (yesOrNot.equals("no")) {
                        point = 0;
                    }
                }

            } while (point != 0);


        }

    }

