import java.util.*;

public class Main {
    public static void main(String[] args) {

    }

    public static void A(){
        List<Integer>  temp = new ArrayList<>();
        Map<Integer, String> stream = new HashMap<>();
        Integer tempInt = 1;

        stream.put(1,"string1");
        stream.put(2,"string1");
        stream.put(3,"string1");
        stream.put(4,"string1");
        stream.put(5,"string1");
        stream.entrySet().stream()
                .filter(x -> x.getValue().length() > 5)
                .filter(x -> x.getKey() % 3 == 0)
                .peek(x -> temp.add(x.getKey()))
                .forEach(System.out::println);

        for (Integer integer : temp) {
            tempInt *= integer;
        }
        System.out.println(tempInt);
    }

    public static void B(){
        Random random = new Random();
        List<Integer> randomNum = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            randomNum.add(random.nextInt(100));
        }

        List<Integer> integers = new ArrayList<>();
        randomNum.stream()
                .map(num -> {
                    if (num % 2 != 0){
                        integers.add(num);
                    }else {
                        return num;
                    }
                    return null;
                })
                .filter(num -> num % 2 == 0)
                .forEach(System.out::println);

    }
}
