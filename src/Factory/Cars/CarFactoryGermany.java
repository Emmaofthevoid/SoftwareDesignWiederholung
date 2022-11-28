package Factory.Cars;

public class CarFactoryGermany extends CarFactoryGeneric{
    @Override
    public Car makeCar(CarType carType) {
        if(carType == CarType.LKW) {
            System.out.println("No car from Germany");
            return null;
        }

        else if(carType == CarType.PWK)
            return  new PWK();
        else if (carType == CarType.SPORTWAGEN)
            return new Sportwagen();

        else {
            return null;
        }

    }
}
