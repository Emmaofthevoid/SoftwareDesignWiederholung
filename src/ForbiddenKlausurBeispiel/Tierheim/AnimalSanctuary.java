package ForbiddenKlausurBeispiel.Tierheim;

public class AnimalSanctuary extends Sanctuary {
    @Override
    public Animal giveToNewHome(Species species) {
        Animal animal;

        if (species == Species.DOG) {
            return animal = new Dog();
        } else if (species == Species.CAT) {
            return animal = new Cat();
        } else
            return null;
    }
}
