package Animal;

import Animal.AnimalAbstract;

public class Dog extends AnimalAbstract {
    public Dog(int age) {
        super(age);
    }

    @Override
    public String toString() {
        return "Animal.Dog{age -> "+getAge()+'}';
    }
}
