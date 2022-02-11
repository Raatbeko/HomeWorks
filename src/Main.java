import javax.swing.plaf.IconUIResource;
import java.awt.event.MouseAdapter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        collecting();

    }

    public static LinkedList addCatAndDog(){
        LinkedList<AnimalAbstract> animals = new LinkedList<>();
        for (int i = 1; i < 100; i++) {
            animals.add(new Cat(i++));
            animals.add(new Dog(i));
        }

        return animals;
    }

    public static LinkedList<AnimalAbstract> addMause(LinkedList<AnimalAbstract> animals){
        int countCat = 0;
        int countDog = 0;
        for (int i = 1; i < 100; i++) {
            animals.add(new Cat(i++));
            animals.add(new Dog(i));
        }

        for (int i = 0;i<animals.size();i++) {
            if (animals.get(i) instanceof Cat){
                countCat++;
                if(countCat%5==0){
                    animals.remove(i);
                }
            }
            if (animals.get(i) instanceof Dog){
                countDog++;
                if (countDog%3 == 0){
                    animals.add(i+1,new Mause(i));
                }
            }
        }

        return animals;
    }

    public static LinkedList<AnimalAbstract> foundCatAndMause(LinkedList<AnimalAbstract> animals){
        LinkedList<AnimalAbstract> catAndMause = new LinkedList<>();
        for (int i = 0; i < animals.size()-1; i++) {
            if (animals.get(i+1)!= null) {
                if (animals.get(i) instanceof Mause && animals.get(1 + i) instanceof Cat) {
                    catAndMause.add(animals.get(i));
                    catAndMause.add(animals.get(i + 1));
                    animals.remove(i);
                    animals.remove(i + 1);
                    i++;
                }
            }
        }
        return catAndMause;
    }

    public static ArrayList<AnimalAbstract> foundDogAndMause(LinkedList<AnimalAbstract> animals){
        List<AnimalAbstract> dogAndMause = new ArrayList<>();
        for (int i = 0; i < animals.size(); i++) {
            if(animals.get(i) instanceof Dog || animals.get(i) instanceof Mause){
                dogAndMause.add( animals.get(i));
            }
        }
        return (ArrayList) dogAndMause;
    }

    public static String sumOfAge(LinkedList<AnimalAbstract> animals){

        int sumOfAgeCat=0,sumOfAgeDog=0,sumOfAgeMause=0;
        for (int i = 0; i < animals.size(); i++) {
            if (animals.get(i) instanceof Cat){
                sumOfAgeCat+=animals.get(i).getAge();
            }else if (animals.get(i) instanceof Dog){
                sumOfAgeDog+=animals.get(i).getAge();

            }else {
                sumOfAgeMause+=animals.get(i).getAge();
            }
        }

        return "Sum of age dog-> "+sumOfAgeDog+"\nSum of age Cat-> "+sumOfAgeCat+"\nSum of age Mause->"+sumOfAgeMause;
    }

    public static   LinkedList<AnimalAbstract> moveAll(LinkedList<AnimalAbstract> animals){
        LinkedList<AnimalAbstract> animals2  = new LinkedList<>();
        for (int i = 0; i < animals.size(); i++) {
            if (animals.get(i) instanceof Cat){
                animals2.add(animals.get(i));
            }
        }
        for (int i = 0; i < animals.size(); i++) {
            if (animals.get(i) instanceof Dog){
                animals2.add(animals.get(i));
            }
        }
        for (int i = 0; i < animals.size(); i++) {
            if (animals.get(i) instanceof Mause){
                animals2.add(animals.get(i));
            }
        }
        return  animals2;

    }

    public static void collecting(){
        System.out.println(foundCatAndMause(addMause(addCatAndDog())));
        System.out.println(foundDogAndMause(addMause(addCatAndDog())));
        System.out.println(moveAll(addMause(addCatAndDog())));
        System.out.println(sumOfAge( addMause(addCatAndDog())));

    }


}
