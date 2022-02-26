package it.academy;

import student.Student;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Set;

public class Group {
    private GroupType groupType;
    private int courseNum;
    private int numOFGroup;
    private Set<Student> setOfStudents;

    public Group() {
    }

    public Group(GroupType groupType, int courseNum, int numOFGroup, Set<Student> setOfStudents) {
        this.groupType = groupType;
        this.courseNum = courseNum;
        this.numOFGroup = numOFGroup;
        this.setOfStudents = setOfStudents;
    }


    public void addStudent(Student student){
        setOfStudents.add(student);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Group group = (Group) o;
        return numOFGroup == group.numOFGroup && groupType == group.groupType && Objects.equals(setOfStudents, group.setOfStudents);
    }

    @Override
    public int hashCode() {
        return Objects.hash(groupType, numOFGroup, setOfStudents);
    }

    @Override
    public String toString() {
        return "Group{" +
                "groupType=" + groupType +
                ", numOFGroup=" + numOFGroup +
                ", students=" + setOfStudents +
                '}';
    }

    public int getCourseNum() {
        return courseNum;
    }

    public void setCourseNum(int courseNum) {
        this.courseNum = courseNum;
    }

    public Set<Student> getSetOfStudents() {
        return setOfStudents;
    }

    public void setSetOfStudents(Set<Student> setOfStudents) {
        this.setOfStudents = setOfStudents;
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

    public Set<Student> getStudents() {
        return setOfStudents;
    }

    public void setStudents(Set<Student> students) {
        this.setOfStudents = students;
    }
}
