import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Student studentOne = new Student();
        studentOne.name = "Maks";
        studentOne.age = 18;
        studentOne.gender = "Man";
        studentOne.whatCourseIsHeIn = "3";
        studentOne.whoIsStudyingAt = "Soft engineer";
        studentOne.howDoesHeStudy = "well";
        studentOne.informationAboutStudent();

        System.out.println();

        Student studentTwo = new Student();
        studentTwo.name = "Marina";
        studentTwo.age = 17;
        studentTwo.gender = "woman";
        studentTwo.whatCourseIsHeIn = "1";
        studentTwo.whoIsStudyingAt = "dentist";
        studentTwo.howDoesHeStudy = "We aren't know ";
        studentTwo.informationAboutStudent();
        System.out.println();

        Student studentThree = new Student();
        studentThree.name = "Mark";
        studentThree.age = 24;
        studentThree.gender = "Man";
        studentThree.whatCourseIsHeIn = "5";
        studentThree.whoIsStudyingAt = "Business management";
        studentThree.howDoesHeStudy = "SO cool ";
        studentThree.informationAboutStudent();


    }
}
