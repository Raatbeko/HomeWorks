package bus;

import bus.passangers.Passangers;

import java.util.Arrays;
import java.util.Scanner;

public class Bus {
    private  final Passangers[] passangers;

    public Bus(int size) {
        this.passangers = new Passangers[size];
    }

    public void addPassanger(Passangers[] passangers){
        for (int i = 0; i < passangers.length; i++) {
            this.passangers[i] = passangers[i];
            System.out.println("N" +i + ":"+this.passangers[i].getName());
        }
        System.out.println("Do you want add new passangers?");
        String addNewPassangers = scanner.nextLine();

        if (addNewPassangers.equals("Yes")) {

            System.out.println("choose the please: " + Arrays.toString(this.passangers) + "\nNum: ");
            int numOfPlease = scanner.nextInt();


            System.out.println("Name: ");
            String name = scanner.next();


            System.out.print("Price: ");
            int priceOfRoad = scanner.nextInt();
            this.passangers[numOfPlease] = new Passangers(name,priceOfRoad);
        }

        System.out.println(Arrays.toString(this.passangers));



    }


    public void removePassanger(int numElem){
        passangers[numElem] = null;
    }

    public void showPassenger(Passangers[] passangerse){
        for (Passangers passanger : passangerse) {
            System.out.println(passanger);
        }

    }

    public void searchPassanger(){
            String findPassangers = scanner.nextLine();
            for (int i = 0; i < passangers.length; i++) {

                if (findPassangers.equals(passangers[i].getName())) {

                    System.out.println(passangers[i]);

                }

            }


    }

    public void calculate(){

    }

        Scanner scanner = new Scanner(System.in);
    public void results(Passangers[] passangers) {
        for (int i = 0; i < passangers.length-1; i++) {
            System.out.println(passangers[i]);
        }
        if (Passangers.count > passangers.length) {

            System.out.println("There're no seats ");

        }
        boolean find = true;
        while (find) {

            System.out.println("Do you want add new passangers?");
            String addNewPassangers = scanner.nextLine();

            if (addNewPassangers.equals("Yes")) {

                System.out.println("choose the please: " + Arrays.toString(passangers) + "\nNum: ");
                int numOfPlease = scanner.nextInt();


                System.out.println("Name: ");
                String name = scanner.next();


                System.out.print("Price: ");
                int priceOfRoad = scanner.nextInt();
                passangers[numOfPlease] = new Passangers(name,priceOfRoad);
            }

            System.out.println(Arrays.toString(passangers));
            find = false;
        }


    }
}
