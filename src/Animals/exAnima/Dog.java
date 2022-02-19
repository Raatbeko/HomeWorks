package Animals.exAnima;

import Animals.AbsAnimal;

public class Dog extends AbsAnimal {
    public Dog() {
    }

    public Dog(String name, int weight) {
        super(name, weight);
    }

    @Override
    public String toString() {
        return "Dog{ name:"+getName()+" weight:"+getWeight()+"}\n";
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

}
