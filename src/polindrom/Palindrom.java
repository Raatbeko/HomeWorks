package polindrom;

import java.util.Scanner;

public class Palindrom {
    public static void main(String[] args) {
        System.out.println("Enter a five-digit number");
        boolean check = true;
        int number = 0;
        while (check){
            number = new Scanner(System.in).nextInt();
            if(String.valueOf(number).length() == 5){
                check = false;
            }
        }
        System.out.println(palindrom(number));
    }
    public static boolean palindrom(int number){
        String palindromNum = String.valueOf(number);
        if (palindromNum.length() != 5)return false;
        String palindromNumSecond = "";
        for (int i = palindromNum.length()-1; i >= 0; i--) {
            palindromNumSecond += palindromNum.charAt(i);
        }
        if (number == Integer.parseInt(palindromNumSecond))return true;
        else return false;
    }

}
