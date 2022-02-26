package Management;

import it.academy.Group;
import student.Student;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class ITAcademyManagement implements Management {
    private ArrayList<Group> groups;

    private ArrayList<Student> students;

    public ITAcademyManagement(ArrayList<Group> groups, ArrayList<Student> students) {
        this.groups = groups;
        this.students = students;
    }

    @Override
    public boolean addGroup(Group group) {

        return groups.add(group);
    }

    @Override
    public boolean addStudentToGroup(int numOfGroup, Student student) {
        for (int i = 0; i < groups.size(); i++) {
            if (groups.get(i).getNumOFGroup() == numOfGroup) {
                groups.get(i).addStudent(student);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean removeStudentInGroup(int numOfGroup, Student student) {
        for (int i = 0; i < groups.size(); i++) {
            if (groups.get(i).getNumOFGroup() == numOfGroup) {
                for (Student student1 : groups.get(i).getStudents()) {
                    if (student.equals(student1)) {
                        return groups.get(i).getStudents().remove(student);
                    }
                }
            }
        }
        return false;
    }

    @Override
    public void transferToTheNextCourse(Group group) {
        groups.get(groups.
                        indexOf(group)).
                setCourseNum(groups.
                        get(groups.
                                indexOf(group)).
                        getCourseNum() + 1);
    }

    @Override
    public void showTheAverageScoreOfTheGroup() {
        try {
            for (Group group : groups) {
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
        for (Group group : groups) {
            for (Student student : group.getStudents()) {
                if (student.gradePointAverage()<61){
                    students.add(student);
                    fileWriter.write(student.getName());
                    return group.getStudents().remove(student);
                }
            }
        }
        return false;
    }
    public void showAllGroup(){
        System.out.println(groups);
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public ArrayList<Group> getGroups() {
        return groups;
    }

    public void setGroups(ArrayList<Group> groups) {
        this.groups = groups;
    }
}
