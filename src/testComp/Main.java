package testComp;

import Animal.AnimalAbstract;
import Animal.Cat;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<AnimalAbstract> cat= new LinkedList<>();
        ArrayList<AnimalAbstract> cat2 = new ArrayList<>();
        addCat(cat,cat2);

    }
    public static void addCat(LinkedList<AnimalAbstract> cat1, ArrayList<AnimalAbstract> cat2){
        for (int i = 0; i < 1000000; i++) {
            cat1.add(new Cat(i));
            cat2.add(new Cat(i));
        }
        long time1 = System.currentTimeMillis();
        for (int i = 0;i<100;i++){
            cat1.add(500000,new Cat(i));

        }
        long time2 = System.currentTimeMillis();
        System.out.println("Linked middle finished->" +(time2-time1));

        long time3 = System.currentTimeMillis();
        for (int i = 0;i<100;i++){
            cat2.add(500000,new Cat(i));

        }
        long time4 = System.currentTimeMillis();
        System.out.println("Array middle finished->" +(time4-time2));

        long time = System.currentTimeMillis();

        for (int i = 0; i < 100; i++) {
            cat1.add(1,new Cat(i));
        }
        long time5 = System.currentTimeMillis();

        System.out.println("Linked finish of beginning->" + (time5-time));

        long time6 = System.currentTimeMillis();

        for (int i = 0; i < 100; i++) {
            cat2.add(1,new Cat(i));
        }
        long time7 = System.currentTimeMillis();
        System.out.println("Array finish of beginning->" + (time6-time7));

        long time8 = System.currentTimeMillis();
        System.out.println(cat1.get(500000));
        long time9 = System.currentTimeMillis();
        System.out.println("Linked finish of get->" + (time8-time9));

        long time94 = System.currentTimeMillis();
        System.out.println(cat2.get(500000));
        long time95 = System.currentTimeMillis();
        System.out.println("Array finish of get->" + (time94-time95));



    }
}
