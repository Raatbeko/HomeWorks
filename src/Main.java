import students.Group;
import students.Students;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Group group = new Group(1, "GroupFirst ", new Students[]{new Students("Arafat", 16), new Students("Marat", 17), new Students("Kuba", 16), new Students("Kolya", 18)});
        Group group3 = new Group(2, "GroupSecond ", new Students[]{new Students("Arafat", 16), new Students("Marat", 17), new Students("Kuba", 16), new Students("Kolya", 18)});

        Group.nameOfGroup(new Group[]{group, group3});
        int choice;
        do {
            System.out.println("1. Add student" + "\n2. Found group of name" + "\n3. Show all group with student" + "\n0. nothing");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Input the group");
                    String chooseGroup = scanner.next();
                    if (chooseGroup.equals("GroupFirst") || chooseGroup.equals("1")) {
                        group.addStudent();
                    } else if (chooseGroup.equals("GroupSecond") || chooseGroup.equals("2")) {
                        group3.addStudent();
                    } else System.out.println("There is no such group");
                    break;
                case 2:
                    System.out.println("Input group");
                    String chooseGroup2 = scanner.next();
                    if (chooseGroup2.equals("GroupFirst") || chooseGroup2.equals("1")) {
                        group.searchGroup(chooseGroup2);
                    } else if (chooseGroup2.equals("GroupSecond") || chooseGroup2.equals("2")) {
                        group3.searchGroup(chooseGroup2);
                    } else System.out.println("There is no such group");
                    break;
                case 3:
                    Group.showAllGroup(new Group[]{group, group3});
                    break;
            }

        } while (choice != 0);

    }
}
