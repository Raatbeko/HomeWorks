package Animal;

public class Parrot extends PetAbs {
    public Parrot() {
    }

    public Parrot(String name, int age) {
        super(name, age);
    }

    @Override
    public String toString() {
        return "Parrot{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                '}';
    }
}
