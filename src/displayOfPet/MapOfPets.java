package displayOfPet;

import Animal.Cat;
import Animal.Dog;
import Animal.Parrot;
import Animal.PetAbs;

import java.util.Map;


public interface MapOfPets {
    Map<Cat, PetAbs> createMapOfCat();

    Map<Cat, PetAbs> addCatAndSomePet();

    Map<Dog, PetAbs> createMapOfDog();

    Map<Dog, PetAbs> addDogAndSomePet();

    Map<Parrot, PetAbs> createMapOfParrot();

    Map<Parrot, PetAbs> addParrotAndSomePet();


}
