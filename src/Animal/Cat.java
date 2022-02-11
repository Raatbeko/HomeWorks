package Animal;

import Animal.AnimalAbstract;

public class Cat extends AnimalAbstract {
    public Cat(int age) {
        super(age);
    }

    @Override
    public String toString() {
        return "Animal.Cat{age -> "+getAge()+'}';
    }
}
