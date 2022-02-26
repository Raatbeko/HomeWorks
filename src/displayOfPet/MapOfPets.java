package displayOfPet;

import Animal.Cat;
import Animal.Dog;
import Animal.Parrot;
import Animal.PetAbs;

import java.util.Map;


public interface MapOfPets {


    Map<Cat, PetAbs> addCatAndSomePet();

    Map<Dog, PetAbs> addDogAndSomePet();

    Map<Parrot, PetAbs> addParrotAndSomePet();


}
