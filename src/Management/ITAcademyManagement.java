package Management;

import it.academy.Group;
import student.Student;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class ITAcademyManagement implements Management {
    @Override
    public ArrayList<Group> createListGroup() {
        return new ArrayList<>();
    }

    @Override
    public ArrayList<Student> studentsForEnrollment() {
        return new ArrayList<>();
    }

    @Override
    public boolean addGroup(Group group) {
        ArrayList<Group> arrayList = createListGroup();
        arrayList.add(group);
        return false;
    }

    @Override
    public boolean addStudentToGroup(int numOfGroup, Student student) {
        for (int i = 0; i < createListGroup().size(); i++) {
            if (createListGroup().get(i).getNumOFGroup() == numOfGroup) {
                createListGroup().get(i).addStudent(student);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean removeStudentInGroup(int numOfGroup, Student student) {
        for (int i = 0; i < createListGroup().size(); i++) {
            if (createListGroup().get(i).getNumOFGroup() == numOfGroup) {
                for (Student student1 : createListGroup().get(i).getStudents()) {
                    if (student.equals(student1)) {
                        return createListGroup().get(i).getStudents().remove(student);
                    }
                }
            }
        }
        return false;
    }

    @Override
    public void transferToTheNextCourse(Group group) {
        createListGroup().get(createListGroup().
                        indexOf(group)).
                setCourseNum(createListGroup().
                        get(createListGroup().
                                indexOf(group)).
                        getCourseNum() + 1);
    }

    @Override
    public void showTheAverageScoreOfTheGroup() {
        try {
            for (Group group : createListGroup()) {
                System.out.println(group.getGroupType() + ": " + group.averageGroup());
            }
        }catch (NullPointerException ex){
            System.out.println(ex.getMessage());
        }
    }

    @Override
    public boolean checkScoreCopyToFileAndRemoveOnSet() throws IOException {
        File file = new File("expelledStudent.txt");
        FileWriter fileWriter = new FileWriter(file);
        for (Group group : createListGroup()) {
            for (Student student : group.getStudents()) {
                if (student.gradePointAverage()<61){
                    studentsForEnrollment().add(student);
                    fileWriter.write(student.getName());
                    return group.getStudents().remove(student);
                }
            }
        }
        return false;
    }
}
