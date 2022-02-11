package Animal;

import Animal.AnimalAbstract;

public class Mause extends AnimalAbstract {
    public Mause(int age) {
        super(age);
    }

    @Override
    public String toString() {
        return "Animal.Mause{age ->" +getAge()+ "}";
    }
}
