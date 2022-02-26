package menu;

import Management.ITAcademyManagement;
import it.academy.Group;
import it.academy.GroupType;
import student.Student;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Menu {

    public void collectAllMenu(){
        System.out.println(choiceAction());

        boolean control = true;
        int num;
        while (control){
            num = inputOnConsole().nextInt();
            switch (num){
                case 1:
                    addNewGroup();
                    break;
                case 2:
                    addNewStudent();
                    break;
                case 3:
                    removeStudent();
                    break;
                case 4:
                    updateGroup();
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

    public ITAcademyManagement getITAcademyManagement() {
        return new ITAcademyManagement();
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
        getITAcademyManagement().addGroup(new Group(GroupType.valueOf(typeOfGroup), courseNum, numOfGroup, new HashSet<>()));
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

        getITAcademyManagement().addStudentToGroup(numOfGroup, new Student(id, name, subjectAssessment));
    }
    public void removeStudent(){
        String nameOfStudent;
        int numOfGroup;
        System.out.print("Name student-> ");
        nameOfStudent = inputOnConsole().next();
        System.out.print("Num group-> ");
        numOfGroup = inputOnConsole().nextInt();
        for (Group group : getITAcademyManagement().createListGroup()) {
            for (Student student : group.getStudents()) {
                if (nameOfStudent.equals(student.getName())){
                   if (getITAcademyManagement().removeStudentInGroup(numOfGroup,student)) System.out.println("Студенты удалены;");;
                }
            }
        }
    }
    public void updateGroup(){
        System.out.print("Num group-> ");
        int numOfGroup = inputOnConsole().nextInt();
        for (Group group : getITAcademyManagement().createListGroup()) {
            if (group.getNumOFGroup() == numOfGroup){
                getITAcademyManagement().transferToTheNextCourse(group);
            }
        }
    }
    public void copyFile(){
        try {
            if (getITAcademyManagement().checkScoreCopyToFileAndRemoveOnSet())
                System.out.println("Отчисленные студенты добавлены в файл!");
            else System.out.println("Все студенты прошли!");
        }catch (IOException ex){
        System.out.println(ex.getMessage());
        }
    }
    public void showTheAverageScoreOfTheGroup(){
        getITAcademyManagement().showTheAverageScoreOfTheGroup();
    }

}
