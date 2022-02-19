package Animals;

import java.util.Objects;

public abstract class AbsAnimal {
    private String name;
    private int weight;

    public AbsAnimal() {
    }

    public AbsAnimal(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AbsAnimal absAnimal = (AbsAnimal) o;
        return weight == absAnimal.weight && Objects.equals(name, absAnimal.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, weight);
    }
}
