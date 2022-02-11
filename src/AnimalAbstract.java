public abstract class AnimalAbstract {
    private int age;

    public AnimalAbstract(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "AnimalAbstract{" +
                "age=" + age +
                '}';
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
