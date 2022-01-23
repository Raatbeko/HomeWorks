package residents;

public class Residents {
    public static void main(String[] args) {

    }

    public static void countResidents(int[] count) {
        int rightResidents = 0, leftResidents = 0;

        for (int i = 0; i < count.length; i++) {
            rightResidents += count[i];
            leftResidents += count[i + 1];
            i++;
        }
        if (rightResidents > leftResidents) {
            System.out.println("More right side");
        } else{
            System.out.println("More left side");
        }
    }
}
