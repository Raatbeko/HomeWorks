package pizza;

import java.util.Scanner;

public class PizzaStore {
    Scanner scanner = new Scanner(System.in);
    private Magarita[] margarita ;
    private LaFinta[] laFinta ;
    private Peperoni[] peperoni;

    public void setMargarita(Magarita margarita,int size) {
        this.margarita = new Magarita[size];
        for (int i = 0; i < this.margarita.length; i++) {
            if (this.margarita[i] == null) {
                this.margarita[i] = margarita;
                break;
            }
        }
        System.out.println("With meat or not? -> ");
        String withMeatOrNot = scanner.next();

        if (withMeatOrNot.equals("yes") || withMeatOrNot.equals("Yes")) {
            margarita.setWithMeatOrNot(true);
        } else {
            margarita.setWithMeatOrNot(false);
        }
        System.out.println("What size?(big,average,small)");
        boolean price = true;

        while (price) {
            String scales = scanner.next();
            if (scales.equals("big")) {

                margarita.setScales(3.5);
                margarita.setPrice(1000);
                price = false;

            } else if (scales.equals("small")) {

                margarita.setScales(1);
                margarita.setPrice(500);
                price = false;


            } else if (scales.equals("average")) {

                margarita.setScales(2);
                margarita.setPrice(700);
                price = false;

            } else {

                System.out.println("You misspelled!");
                price = true;

            }


        }

        System.out.println("Begin cooking or would you like to place an order before?(Cooking , on the front) -> ");
        String order = scanner.next();
        boolean cookOrfront =true;
        while (cookOrfront) {

            if (order.equals("cooking") || order.equals("Cook") || order.equals("cook")) {

                System.out.println("Your order will be ready in 15 min!");
                margarita.setCook("preparing");
                cookOrfront = false;

            } else if (order.equals("front")) {

                System.out.print("Please tell me how long?->");
                String timeOfOrder = scanner.next();
                System.out.println("Ok we are have recorder your order!");
                margarita.setTimeOfOrder(timeOfOrder);
                cookOrfront = false;

            } else {
                System.out.println("Вы ошиблись!!!");
                cookOrfront = true;

            }
        }
        System.out.println("With delivery or not?(Yes,not)");
        String delivering = scanner.next();

        if (delivering.equals("yes") || delivering.equals("Yes") || delivering.equals("yea")) {

            System.out.println("Write your address");
            String addressOfOrder = scanner.next();
            System.out.println("You will be delivery in 30 min!");
            margarita.setAddressOfOrder(addressOfOrder);
            margarita.setDelivery(true);
        }else{
            margarita.setDelivery(false);
        }

        System.out.println(margarita);


    }

    public void setLaFinta(LaFinta laFinta, int size) {
        this.laFinta = new LaFinta[size];
        for (int i = 0; i < this.laFinta.length; i++) {
            if (this.laFinta[i] == null) {
                this.laFinta[i] = laFinta;
                break;
            }
        }
        System.out.print("With mushrooms -> ");
        String withMeatOrNot = scanner.next();
        if (withMeatOrNot.equals("yes") || withMeatOrNot.equals("Yes")) {
            laFinta.setWithCheese(true);
        } else {
            laFinta.setWithCheese(false);
        }

        System.out.println("What size?(big,average,small)");
        boolean price = true;

        while (price) {
            String scales = scanner.next();
            if (scales.equals("big")) {

                laFinta.setScales(3.5);
                laFinta.setPrice(1000);
                price = false;

            } else if (scales.equals("small")) {

                laFinta.setScales(1);
                laFinta.setPrice(500);
                price = false;


            } else if (scales.equals("average")) {

                laFinta.setScales(2);
                laFinta.setPrice(700);
                price = false;

            } else {

                System.out.println("You misspelled!");
                price = true;

            }


        }
        System.out.println("Begin cooking or would you like to place an order before?(Cooking , on the front) -> ");
        String order = scanner.next();

        boolean cookOrfront =true;
        while (cookOrfront) {

            if (order.equals("cooking") || order.equals("Cook") || order.equals("cook")) {

                System.out.println("Your order will be ready in 15 min!");
                laFinta.setCook("preparing");
                cookOrfront = false;

            } else if (order.equals("front")) {

                System.out.print("Please tell me how long?->");
                String timeOfOrder = scanner.next();
                System.out.println("Ok we are have recorder your order!");
                laFinta.setTimeOfOrder(timeOfOrder);
                cookOrfront = false;

            } else {
                System.out.println("Вы ошиблись!!!");
                cookOrfront = true;

            }
        }
        System.out.println("With delivery or not?(Yes,not)");
        String delivering = scanner.next();

        if (delivering.equals("yes") || delivering.equals("Yes") || delivering.equals("yea")) {

            System.out.println("Write your address");
            String addressOfOrder = scanner.next();
            System.out.println("You will be delivery in 30 min!");
            laFinta.setAddressOfOrder(addressOfOrder);
            laFinta.setDelivery(true);

        }else{
            laFinta.setDelivery(false);
        }

        System.out.println(laFinta);


    }

    public void setPeperoni(Peperoni peperoni,int size) {
        this.peperoni = new Peperoni[size];
        for (int i = 0; i < this.peperoni.length; i++) {
            if (this.peperoni[i] == null) {
                this.peperoni[i] = peperoni;
                break;
            }
        }
        System.out.print("With paper -> ");
        String withMeatOrNot = scanner.next();
        if (withMeatOrNot.equals("yes") || withMeatOrNot.equals("Yes")) {
            peperoni.setWithPaperOrNot(true);
        } else {
            peperoni.setWithPaperOrNot(false);
        }
        System.out.println("What size?(big,average,small)");
        boolean price = true;

        while (price) {
            String scales = scanner.next();
            if (scales.equals("big")) {

                peperoni.setScales(3.5);
                peperoni.setPrice(1000);
                price = false;

            } else if (scales.equals("small")) {

                peperoni.setScales(1);
                peperoni.setPrice(500);
                price = false;


            } else if (scales.equals("average")) {

                peperoni.setScales(2);
                peperoni.setPrice(700);
                price = false;

            } else {

                System.out.println("You misspelled!");
                price = true;

            }


        }
        System.out.println("Begin cooking or would you like to place an order before?(Cooking , on the front) -> ");
        String order = scanner.next();

        boolean cookOrfront =true;
        while (cookOrfront) {

            if (order.equals("cooking") || order.equals("Cook") || order.equals("cook")) {

                System.out.println("Your order will be ready in 15 min!");
                peperoni.setCook("preparing");
                cookOrfront = false;

            } else if (order.equals("front")) {

                System.out.print("Please tell me how long?->");
                String timeOfOrder = scanner.next();
                System.out.println("Ok we are have recorder your order!");
                peperoni.setTimeOfOrder(timeOfOrder);
                cookOrfront = false;

            } else {
                System.out.println("Вы ошиблись!!!");
                cookOrfront = true;

            }
        }
        System.out.println("With delivery or not?(Yes,not)");
        String delivering = scanner.next();

        if (delivering.equals("yes") || delivering.equals("Yes") || delivering.equals("yea")) {

            System.out.println("Write your address");
            String addressOfOrder = scanner.next();
            System.out.println("You will be delivery in 30 min!");
            peperoni.setAddressOfOrder(addressOfOrder);

        }

        System.out.println(peperoni);

    }
}
