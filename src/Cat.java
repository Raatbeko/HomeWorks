public class Cat extends AnimalAbstract{
    public Cat(int age) {
        super(age);
    }

    @Override
    public String toString() {
        return "Cat{age -> "+getAge()+'}';
    }
}
