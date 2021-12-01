package Animals;

public class Dog {
    private String age;
    private String name;
    private String breed;
    private String color;

    public void setAgeAnimal(String inputAge) {
        age = inputAge;
    }

    public void setNameAnimal(String inputName) {
        name = inputName;
    }

    public void setBreedAnimal(String inputBreed) {
        breed = inputBreed;
    }

    public void setColorAnimal(String inputColor) {
        color = inputColor;
    }

    public void aboutDog() {
        System.out.println("Name -> " + name + "\nBreed of dog -> " + breed + "\nAge of dog-> " +
                age + "\nColor of dog-> " + color);

    }
}
