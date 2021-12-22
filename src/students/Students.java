package students;

public class Students {
    private String name;
    private int age;
    public static int countStudent = 0;

    public Students() {
        countStudent++;
    }

    public Students(String name, int age) {
        this.name = name;
        this.age = age;
        countStudent++;
    }

    @Override
    public String toString() {
        return "Name: "+ name +"\nAge: " + age ;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
