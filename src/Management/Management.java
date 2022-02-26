package Management;

import it.academy.Group;
import student.Student;

import java.io.IOException;
import java.util.ArrayList;

public interface Management {

    ArrayList<Group> createListGroup();

    ArrayList<Student> studentsForEnrollment();

    boolean addGroup(Group group);

    boolean addStudentToGroup(int numOfGroup,Student student);

    boolean removeStudentInGroup(int numOfGroup, Student student);

    void transferToTheNextCourse(Group group);

    void showTheAverageScoreOfTheGroup();

    boolean checkScoreCopyToFileAndRemoveOnSet() throws IOException;

}
