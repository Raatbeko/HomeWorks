package menu;

import Management.ITAcademyManagement;
import exception.YouNotCreateGroup;
import models.Group;
import enums.GroupType;
import models.Student;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    private ITAcademyManagement itAcademyManagement;

    public Menu() {
    }

    public Menu(ITAcademyManagement itAcademyManagement) {
        this.itAcademyManagement = itAcademyManagement;
    }

    public void collectAllMenu() {

        boolean control = true;
        int num;
        while (control) {
            System.out.println(choiceAction());
            num = inputOnConsole().nextInt();
            switch (num) {
                case 1:
                    addNewGroup();
                    break;
                case 2:
                    itAcademyManagement.showAllGroup();
                    addNewStudent();
                    break;
                case 3:
                        removeStudent();
                    break;
                case 4:
                    try {
                        updateGroup();
                    }catch (YouNotCreateGroup ex){
                        System.out.println("Создайте группу чтобы что то сделать.");
                    }
                    break;
                case 5:
                    copyFile();
                    break;
                case 6:
                    showTheAverageScoreOfTheGroup();
                    break;
                default:
                    if (0 == num) {
                        return;
                    }

            }
        }
    }

    public Scanner inputOnConsole() {
        return new Scanner(System.in);
    }

    public String choiceAction() {
        return "Добавит новую группу - 1\n" +
                "Добавить нового студента в группу - 2\n" +
                "Удалить студента из группы - 3\n" +
                "Перевод группы на следующий курс - 4\n " +
                "Записать в файл всех студентов на отчисление - 5\n" +
                "Вывести на консоль средний бал группы - 6\n\n";
    }

    public void addNewGroup() {
        String typeOfGroup;
        int courseNum, numOfGroup;
        System.out.print("Имя группы-> ");
        typeOfGroup = inputOnConsole().next();
        System.out.print("Курс группы-> ");
        courseNum = inputOnConsole().nextInt();
        System.out.print("Номер группы-> ");
        numOfGroup = inputOnConsole().nextInt();
        itAcademyManagement.addGroup(new Group(GroupType.valueOf(typeOfGroup), courseNum, numOfGroup, new ArrayList<>()));
    }

    public void addNewStudent() {
        String name;
        int id, numOfGroup, OOP, collection, if_else;

        System.out.println("NumOfGroup-> ");
        numOfGroup = inputOnConsole().nextInt();
        System.out.print("Name-> ");
        name = inputOnConsole().next();
        System.out.print("ID-> ");
        id = inputOnConsole().nextInt();
        System.out.print("Оценка по ООП-> ");
        OOP = inputOnConsole().nextInt();
        System.out.print("Оценка по Collection-> ");
        collection = inputOnConsole().nextInt();
        System.out.print("Оценка по if_else -> ");
        if_else = inputOnConsole().nextInt();

        ArrayList<Integer> subjectAssessment = new ArrayList<>();
        subjectAssessment.add(OOP);
        subjectAssessment.add(collection);
        subjectAssessment.add(if_else);

        itAcademyManagement.addStudentToGroup(numOfGroup, new Student(id, name, subjectAssessment));
    }

    public void removeStudent() {
        String nameOfStudent;
        int numOfGroup;
        System.out.print("Name student-> ");
        nameOfStudent = inputOnConsole().next();
        System.out.print("Num group-> ");
        numOfGroup = inputOnConsole().nextInt();
        for (Group group :  itAcademyManagement.getGroups()) {
            for (Student student : group.getStudents()) {
                if (nameOfStudent.equals(student.getName())) {
                    if ( itAcademyManagement.removeStudentInGroup(numOfGroup, student))
                        System.out.println("Студенты удалены;");
                    ;
                }
            }
        }
    }

    public void updateGroup() {
        System.out.print("Num group-> ");
        int numOfGroup = inputOnConsole().nextInt();
        for (Group group : itAcademyManagement.getGroups()) {
            if (group.getNumOFGroup() == numOfGroup) {
                itAcademyManagement.transferToTheNextCourse(group);
            }
        }
    }

    public void copyFile() {
        try {
            if ( itAcademyManagement.checkScoreCopyToFileAndRemoveOnSet())
                System.out.println("Отчисленные студенты добавлены в файл!");
            else System.out.println("Все студенты прошли!");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void showTheAverageScoreOfTheGroup() {
        itAcademyManagement.showTheAverageScoreOfTheGroup();
    }

}
