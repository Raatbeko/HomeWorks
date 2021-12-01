package Students;

public class Group {
    private Student[] student;
    private int course;
    private String dataOfBegin;
    private String finish;

    public String getFinish() {
        return finish;
    }

    public void setFinish(String finish) {
        this.finish = finish;
    }

    public String getDataOfBegin() {
        return dataOfBegin;
    }

    public void setDataOfBegin(String dataOfBegin) {
        this.dataOfBegin = dataOfBegin;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public Student[] getStudent() {
        return student;
    }

    public void setStudent(Student[] student) {
        this.student = student;
    }
}
