package HomeWork;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] arr = {"Maks","Marina","Mark"};
        System.out.println("We are have three student;");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        Scanner scanner = new Scanner(System.in);
        boolean student = true;
        while (student) {
            String name = scanner.nextLine();
            if (name.equals("Maks")) {
                Student studentOne = new Student();
                studentOne.name = "Maks";
                studentOne.age = 18;
                studentOne.gender = "Man";
                studentOne.whatCourseIsHeIn = "3";
                studentOne.whoIsStudyingAt = "Soft engineer";
                studentOne.howDoesHeStudy = "well";
                studentOne.informationAboutStudent();
            } else if (name.equals("Marina")) {
                Student studentTwo = new Student();
                studentTwo.name = "Marina";
                studentTwo.age = 17;
                studentTwo.gender = "woman";
                studentTwo.whatCourseIsHeIn = "1";
                studentTwo.whoIsStudyingAt = "dentist";
                studentTwo.howDoesHeStudy = "We aren't know ";
                studentTwo.informationAboutStudent();
            } else if (name.equals("Mark")) {
                Student studentThree = new Student();
                studentThree.name = "Mark";
                studentThree.age = 24;
                studentThree.gender = "Man";
                studentThree.whatCourseIsHeIn = "5";
                studentThree.whoIsStudyingAt = "Business management";
                studentThree.howDoesHeStudy = "SO cool ";
                studentThree.informationAboutStudent();
            }else System.out.println("We don't have such a student");
            System.out.println("Yet? Yes or Not");
            String yesOrNot = scanner.nextLine();
            if (yesOrNot.equals("Yes")){
                student = true;
            }else {
                student = false;
            }
        }

    }
}
