package Factory.Cars;

public class Main {
    public static void main(String[] args) {

        CarFactoryGeneric carFactoryGermany = new CarFactoryGermany();
        CarFactoryEngland carFactoryEngland = new CarFactoryEngland();

        carFactoryGermany.makeCar(CarType.SPORTWAGEN);
        carFactoryGermany.makeCar(CarType.LKW);
        carFactoryGermany.makeCar(CarType.PWK);

        carFactoryEngland.makeCar(CarType.SPORTWAGEN);
        carFactoryEngland.makeCar(CarType.LKW);
        carFactoryEngland.makeCar(CarType.PWK);

    }
}
