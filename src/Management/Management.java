package Management;

import it.academy.Group;
import student.Student;

import java.util.ArrayList;

public interface Management {
    ArrayList<Group> createListGroup();

    ArrayList<Student> studentsForEnrollmentAndWriteToFile();

    boolean addGroup(Group group);

    boolean addStudentToGroup(int numOfGroup,Student student);

    boolean removeStudentInGroup(int numOfGroup, Student student);

    void transferToTheNextCourse();

    void showTheAverageScoreOfTheGroup();

}
