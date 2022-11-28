package Factory.Cars;

public class PWK extends Car {

    public PWK() {
        System.out.println("New PWK");
    }

    @Override
    public void hupen() {
        System.out.println("PKW hupt");
    }

    @Override
    public void waschen() {
        System.out.println("PKW wäscht");
    }
}
