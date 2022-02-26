package Management;

import it.academy.Group;
import models.Student;

import java.io.IOException;

public interface Management {


    boolean addGroup(Group group);

    boolean addStudentToGroup(int numOfGroup,Student student);

    boolean removeStudentInGroup(int numOfGroup, Student student);

    void transferToTheNextCourse(Group group);

    void showTheAverageScoreOfTheGroup();

    boolean checkScoreCopyToFileAndRemoveOnSet() throws IOException;

}
