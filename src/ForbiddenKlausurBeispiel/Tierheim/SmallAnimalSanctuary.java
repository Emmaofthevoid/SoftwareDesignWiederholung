package ForbiddenKlausurBeispiel.Tierheim;

public class SmallAnimalSanctuary extends Sanctuary {

    @Override
    public Animal giveToNewHome(Species species) {
        Animal animal;
        if (species == Species.GUINEAPIG) {

            return animal = new GuineaPig();
        } else if (species == Species.BUNNY) {

            return animal = new Bunny();
        } else {
            return null;
        }
    }
}
