package Animals;

public class Parrot {
    private String ageParrot;
    private String nameParrot;
    private String breedParrot;
    private String colorParrot;
    private String lifeInHomeOrWild;
    public void setAgeAnimal(String inputAge) {
        ageParrot = inputAge;
    }

    public void setNameAnimal(String inputName) {
        nameParrot = inputName;
    }

    public void setBreedAnimal(String inputBreed) {
        breedParrot = inputBreed;
    }

    public void setColorAnimal(String inputColor) {
        colorParrot = inputColor;
    }
    public void setLifeInHomeOrWild(String inputLifeInHomeOrWild){
        lifeInHomeOrWild = inputLifeInHomeOrWild;
    }
    public void aboutParrot() {
        System.out.println("Name -> " + nameParrot + "\nBreed of dog -> " + breedParrot + "\nAge of dog-> " +
                ageParrot + "\nColor of dog-> " + colorParrot + "\nlife in home or wild-> " + lifeInHomeOrWild);

    }
}
