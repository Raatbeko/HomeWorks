package displayOfPet;

import Animal.Cat;
import Animal.Dog;
import Animal.Parrot;
import Animal.PetAbs;

import java.util.HashMap;
import java.util.Map;

public class HomeWhereHaveDisplayOfPet implements MapOfPets {

    public void showAllMaps() {
        System.out.println(addCatAndSomePet());
        System.out.println(addDogAndSomePet());
        System.out.println(addParrotAndSomePet());
    }

    @Override
    public Map<Cat, PetAbs> createMapOfCat() {
        return new HashMap<>();
    }

    @Override
    public Map<Cat, PetAbs> addCatAndSomePet() {
        Map<Cat, PetAbs> catPetAbsMap = createMapOfCat();

        catPetAbsMap.put(new Cat("Morty", 2), new Parrot("Kosh", 1));
        catPetAbsMap.put(new Cat("Sad", 2), new Dog("Pety", 1));
        catPetAbsMap.put(new Cat("Con", 2), new Cat("Omar", 1));

        return catPetAbsMap;
    }

    @Override
    public Map<Dog, PetAbs> createMapOfDog() {
        return new HashMap<>();
    }

    @Override
    public Map<Dog, PetAbs> addDogAndSomePet() {
        Map<Dog, PetAbs> dogPetAbsMap = createMapOfDog();
        dogPetAbsMap.put(new Dog("Bob", 1), new Cat("Morty", 2));
        dogPetAbsMap.put(new Dog("None", 2), new Dog("Pety", 1));
        dogPetAbsMap.put(new Dog("Agent", 2), new Parrot("Kosh", 1));
        return dogPetAbsMap;
    }

    @Override
    public Map<Parrot, PetAbs> createMapOfParrot() {
        return new HashMap<>();
    }

    @Override
    public Map<Parrot, PetAbs> addParrotAndSomePet() {
        Map<Parrot, PetAbs> parrotPetAbsMap = createMapOfParrot();
        parrotPetAbsMap.put(new Parrot("Mag", 1), new Dog("Pety", 1));
        parrotPetAbsMap.put(new Parrot("Kaban", 2), new Parrot("Kosh", 1));
        parrotPetAbsMap.put(new Parrot("Drag", 1), new Cat("Morty", 2));
        return parrotPetAbsMap;
    }
}
