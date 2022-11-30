package ForbiddenKlausurBeispiel.Tierheim;

public class Main {
    public static void main(String[] args) {
        SmallAnimalSanctuary smallAnimalSanctuary = new SmallAnimalSanctuary();

        smallAnimalSanctuary.giveToNewHome(Species.CAT);
        smallAnimalSanctuary.giveToNewHome(Species.BUNNY);
    }
}
