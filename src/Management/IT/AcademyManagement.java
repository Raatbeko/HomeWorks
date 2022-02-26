package Management.IT;

import Management.Management;
import it.academy.Group;
import student.Student;

import java.util.ArrayList;

public class AcademyManagement implements Management {
    @Override
    public ArrayList<Group> createListGroup() {
        return new ArrayList<>();
    }

    @Override
    public ArrayList<Student> studentsForEnrollmentAndWriteToFile() {
        return new ArrayList<>();
    }

    @Override
    public boolean addGroup(Group group) {
        ArrayList<Group> arrayList = createListGroup();
        arrayList.add(group);
        return false;
    }

    @Override
    public boolean addStudentToGroup(int numOfGroup,Student student) {
        for (int i = 0; i < createListGroup().size(); i++) {
            if (createListGroup().get(i).getNumOFGroup() == numOfGroup){
                createListGroup().get(i).addStudent(student);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean removeStudentInGroup(int numOfGroup, Student student) {
        for (int i = 0; i < createListGroup().size(); i++) {
            if (createListGroup().get(i).getNumOFGroup() == numOfGroup){
                for (Student student1 : createListGroup().get(i).getStudents()) {
                    if (student.equals(student1)){
                        return createListGroup().get(i).getStudents().remove(student);
                    }
                }
            }
        }
        return false;
    }

    @Override
    public void transferToTheNextCourse() {

    }

    @Override
    public void showTheAverageScoreOfTheGroup() {

    }
}
