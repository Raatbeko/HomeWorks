public class Dog extends AnimalAbstract{
    public Dog(int age) {
        super(age);
    }

    @Override
    public String toString() {
        return "Dog{age -> "+getAge()+'}';
    }
}
