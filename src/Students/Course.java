package Students;

public class Course {
    private String data;
    private String nameOfTeacher;
    private int ID;

    public String getNameOfTeacher() {
        return nameOfTeacher;
    }

    public void setNameOfTeacher(String nameOfTeacher) {
        this.nameOfTeacher = nameOfTeacher;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

public void idNumStudents(){
        System.out.println("Data->" + data + "\nName of teacher->" + nameOfTeacher);
    }
}
