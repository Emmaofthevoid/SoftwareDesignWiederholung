package Factory.Cars;

public class CarFactoryEngland extends CarFactoryGeneric {
    @Override
    public Car makeCar(CarType carType) {
        if (carType == CarType.LKW)
            return new LKW();


        else {
            System.out.println("No car from England");
            return null;
        }

    }
}
