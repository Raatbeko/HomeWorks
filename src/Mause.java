public class Mause extends AnimalAbstract{
    public Mause(int age) {
        super(age);
    }

    @Override
    public String toString() {
        return "Mause{age ->" +getAge()+ "}";
    }
}
