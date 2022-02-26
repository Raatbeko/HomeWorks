package student;

import java.util.ArrayList;
import java.util.Objects;

public class Student {
    private int id;
    private String name;
    private ArrayList<Integer> subjectAssessment;

    public Student() {
    }

    public Student(int id, String name, ArrayList<Integer> subjectAssessment) {
        this.id = id;
        this.name = name;
        this.subjectAssessment = subjectAssessment;
    }
     public int gradePointAverage(){
        int sum= 0;
         for (Integer integer : subjectAssessment) {
             sum+=integer;
         }
         return sum/subjectAssessment.size();
     }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id && Objects.equals(name, student.name) && Objects.equals(subjectAssessment, student.subjectAssessment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, subjectAssessment);
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", subjectAssessment=" + subjectAssessment +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Integer> getSubjectAssessment() {
        return subjectAssessment;
    }

    public void setSubjectAssessment(ArrayList<Integer> subjectAssessment) {
        this.subjectAssessment = subjectAssessment;
    }
}
