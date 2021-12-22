package students;

import java.util.Arrays;
import java.util.Scanner;

public class Group {
    private int id;
    private String nameOfGroup;
    private Students[] students;
    public static int countOfGroup = 0;
    Scanner scanner = new Scanner(System.in);

    public Group() {
    }

    public Group(int id, String nameOfGroup, Students[] students) {
        this.id = id;
        this.nameOfGroup = nameOfGroup;
        this.students = students;
        countOfGroup++;

    }

    public void addStudent() {
        System.out.println("Add student?");
        String num = scanner.nextLine();
        for (int i = 0; i < students.length; i++) {
            if (students[i] == null) {

                System.out.print("Name." + '\t');
                String name = scanner.nextLine();

                System.out.print("Age." + '\t');
                int age = scanner.nextInt();

                students[i] = new Students(name, age);

            }else{
                System.out.println("no place");
                break;
            }
        }

    }


    public void showGroups(Group[] group) {
        for (int i = 0; i < group.length; i++) {
            System.out.println("Group: ");
        }


    }

    public void searchGroup(String groups) {
        System.out.println("Students in group: ");

        for (int j = 0; j < students.length; j++) {

            System.out.println("N" + (j + 1) + ". " + students[j]);

        }
    }

    public static void nameOfGroup(Group[] groups) {

        for (int i = 0; i < groups.length; i++) {
            System.out.println("N" + (i + 1) + ": " + groups[i].nameOfGroup);
        }

    }
    public void showStudent(){
        for (Students student : students) {
            System.out.println(student);
            System.out.println();
        }

    }
    public static void showAllGroup(Group[] group){
        for (Group group1 : group) {
            System.out.println(group1.nameOfGroup + "\n");
            group1.showStudent();

        }

    }

    @Override
    public String toString() {
        return "N: " + id + "\nname: " + nameOfGroup;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameOfGroup() {
        return nameOfGroup;
    }

    public void setNameOfGroup(String nameOfGroup) {
        this.nameOfGroup = nameOfGroup;
    }

    public Students[] getStudents() {
        return students;
    }

    public void setStudents(Students[] students) {
        this.students = students;
    }
}
