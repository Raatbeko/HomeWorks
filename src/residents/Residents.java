package residents;

public class Residents {
    public static void main(String[] args) {
        System.out.println(countResidents(5));
    }
    public static String countResidents(int count){
        if (count%2 == 0)return "They're equal!";
        else return "left street more";
    }
}
