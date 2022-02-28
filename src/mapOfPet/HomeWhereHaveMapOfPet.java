package mapOfPet;

import Animal.Cat;
import Animal.Dog;
import Animal.Parrot;
import Animal.PetAbs;

import java.util.Map;

public class HomeWhereHaveMapOfPet implements MapOfPets {

    private Map<Cat,PetAbs> catPetAbsMap;
    private Map<Dog,PetAbs> dogPetAbsMap;
    private Map<Parrot,PetAbs> parrotPetAbsMap;

    public HomeWhereHaveMapOfPet() {
    }

    public HomeWhereHaveMapOfPet(Map<Cat, PetAbs> catPetAbsMap, Map<Dog, PetAbs> dogPetAbsMap, Map<Parrot, PetAbs> parrotPetAbsMap) {
        this.catPetAbsMap = catPetAbsMap;
        this.dogPetAbsMap = dogPetAbsMap;
        this.parrotPetAbsMap = parrotPetAbsMap;
    }

    public void showAllMaps() {
        System.out.println(addCatAndSomePet().keySet());
        System.out.println(addDogAndSomePet().keySet());
        System.out.println(addParrotAndSomePet().keySet());
    }


    @Override
    public Map<Cat, PetAbs> addCatAndSomePet() {

        catPetAbsMap.put(new Cat("Morty", 2), new Parrot("Kosh", 1));
        catPetAbsMap.put(new Cat("Sad", 2), new Dog("Pety", 1));
        catPetAbsMap.put(new Cat("Con", 2), new Cat("Omar", 1));

        return catPetAbsMap;
    }



    @Override
    public Map<Dog, PetAbs> addDogAndSomePet() {

        dogPetAbsMap.put(new Dog("Bob", 1), new Cat("Morty", 2));
        dogPetAbsMap.put(new Dog("None", 2), new Dog("Pety", 1));
        dogPetAbsMap.put(new Dog("Agent", 2), new Parrot("Kosh", 1));
        return dogPetAbsMap;
    }


    @Override
    public Map<Parrot, PetAbs> addParrotAndSomePet() {

        parrotPetAbsMap.put(new Parrot("Mag", 1), new Dog("Pety", 1));
        parrotPetAbsMap.put(new Parrot("Kaban", 2), new Parrot("Kosh", 1));
        parrotPetAbsMap.put(new Parrot("Drag", 1), new Cat("Morty", 2));
        return parrotPetAbsMap;
    }

    public Map<Cat, PetAbs> getCatPetAbsMap() {
        return catPetAbsMap;
    }

    public void setCatPetAbsMap(Map<Cat, PetAbs> catPetAbsMap) {
        this.catPetAbsMap = catPetAbsMap;
    }

    public Map<Dog, PetAbs> getDogPetAbsMap() {
        return dogPetAbsMap;
    }

    public void setDogPetAbsMap(Map<Dog, PetAbs> dogPetAbsMap) {
        this.dogPetAbsMap = dogPetAbsMap;
    }

    public Map<Parrot, PetAbs> getParrotPetAbsMap() {
        return parrotPetAbsMap;
    }

    public void setParrotPetAbsMap(Map<Parrot, PetAbs> parrotPetAbsMap) {
        this.parrotPetAbsMap = parrotPetAbsMap;
    }
}
