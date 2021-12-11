import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Credit numFirst = new Credit(1,1000_0000,"12.11.21 before 12.11.24",5.3);
        Credit numSecond = new Credit(2,250_000,"23.01.21 before 23.01.23",6);
        Credit numThird = new Credit(3,10_000_000,"01.05.19 before 01.05.19",4.5);
        System.out.println(numFirst+"\n" + numSecond+ "\n"+numThird);
        System.out.println();
        Credit.sum(new Credit[]{numFirst,numSecond,numThird});

    }
}
