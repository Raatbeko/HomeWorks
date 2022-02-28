package models;

import enums.GroupType;

import java.util.List;
import java.util.Objects;

public class Group {

    private GroupType groupType;
    private int courseNum;
    private int numOFGroup;
    private List<Student> listOfStudents;

    public Group() {
    }

    public Group(GroupType groupType, int courseNum, int numOFGroup, List<Student> setOfStudents) {
        this.groupType = groupType;
        this.courseNum = courseNum;
        this.numOFGroup = numOFGroup;
        this.listOfStudents = setOfStudents;
    }


    public void addStudent(Student student) {
        listOfStudents.add(student);
    }
    public int averageGroup(){
        int sum = 0;
        for (Student listOfStudent : listOfStudents) {
            sum+=listOfStudent.gradePointAverage();
        }
        return sum/listOfStudents.size();
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Group group = (Group) o;
        return numOFGroup == group.numOFGroup && groupType == group.groupType && Objects.equals(listOfStudents, group.listOfStudents);
    }

    @Override
    public int hashCode() {
        return Objects.hash(groupType, numOFGroup, listOfStudents);
    }

    @Override
    public String toString() {
        return "Group{" +
                "groupType=" + groupType +
                ", courseNum=" + courseNum +
                ", numOFGroup=" + numOFGroup +
                ", setOfStudents=" + listOfStudents +
                '}';
    }


    public int getCourseNum() {
        return courseNum;
    }

    public void setCourseNum(int courseNum) {
        this.courseNum = courseNum;
    }

    public GroupType getGroupType() {
        return groupType;
    }

    public void setGroupType(GroupType groupType) {
        this.groupType = groupType;
    }

    public int getNumOFGroup() {
        return numOFGroup;
    }

    public void setNumOFGroup(int numOFGroup) {
        this.numOFGroup = numOFGroup;
    }

    public List<Student> getStudents() {
        return listOfStudents;
    }

    public void setStudents(List<Student> students) {
        this.listOfStudents = students;
    }
}
