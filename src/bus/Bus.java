package bus;

import bus.passangers.Passangers;

import java.util.Arrays;
import java.util.Scanner;

public class Bus {
    private final Passangers[] passangers;
    Scanner scanner = new Scanner(System.in);


    public Bus(int size) {
        this.passangers = new Passangers[size];
    }

    public void showPassanger(Passangers[] passangers) {
        for (int i = 0; i < passangers.length; i++) {
            this.passangers[i] = passangers[i];
            System.out.println("N" + (i+1) + ":" + this.passangers[i].getName());
        }


    }


    public void removePassanger(int numElem) {
        passangers[numElem] = null;
    }

    public void addPassenger() {
        System.out.println("Do you want add new passangers?");
        String addNewPassangers = scanner.nextLine();
        int numOfPleace = 0;

        if (addNewPassangers.equals("Yes")) {


            System.out.println("Name: ");
            String name = scanner.next();


            System.out.print("Price: ");
            int priceOfRoad = scanner.nextInt();
            for (int i = 0; i < passangers.length; i++) {
                numOfPleace++;
                if (passangers[i] == null) {

                    this.passangers[i] = new Passangers(numOfPleace++,name, priceOfRoad);
                break;
                }
            }
        }

        System.out.println(Arrays.toString(this.passangers));


    }

    public void searchPassanger() {
        String findPassangers = scanner.nextLine();
        for (int i = 0; i < passangers.length; i++) {

            if (findPassangers.equals(passangers[i].getName())) {

                System.out.println(passangers[i]);

            }

        }


    }

    public void calculate() {
        System.out.println( "Sum of price: "+Passangers.sumOfPrice);

    }

    public void sortsObject(){
        int min = 0;
        System.out.println(Arrays.toString(passangers));
        for (int j = 0;j< passangers.length;j++){
            min = j;
            for (int i = 0;i< passangers.length-1;i++){
                if (passangers[i].getNumOfPleace()<  passangers[min].getNumOfPleace()){
                    min= i;

                }
                if (min!=j){
                    Passangers arr = passangers[i];
                    passangers[i] = passangers[min];
                    passangers[min] = arr;
                }
            }
        }
        System.out.println(Arrays.toString(passangers));

    }
}
