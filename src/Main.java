import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        task1();
        task2();
    }

    public static void task1() {
        ArrayList<String> song = new ArrayList<>();
        song.add("Ветер с моря дул");
        song.add("Ноганял беду");
        song.add("И сказал ты мне");
        song.add("Больше не приду");
        ArrayList<String> connecting = new ArrayList<>();
        for (int i = 0; i < song.size(); i++) {
            if (song.get(i).length()>15){
                connecting.add(song.get(i));
                connecting.add(song.get(i));
            }else {
                connecting.add(song.get(i)+ "-"+song.get(i));
            }
        }
        System.out.println(connecting);
    }

    public static void task2() {
        ArrayList<Integer> oddNumber = new ArrayList<>();
        ArrayList<Integer> evenNUmber = new ArrayList<>();
        Random random = new Random();

        int min = 0;
        int max = 100;

        for (int i = 0; i < 50; i++) {
            int num = random.nextInt((max - min + 1) + min);
            if (num % 2 == 0){
                oddNumber.add(num);
            }else {
                evenNUmber.add(num);
            }

        }
        System.out.println(oddNumber);
        System.out.println(evenNUmber);
        System.out.println(oddNumber.size()+evenNUmber.size());
    }


}
