package Factory.Cars;

public class Sportwagen extends Car{

    public Sportwagen() {
        System.out.println("New Sportwagen");
    }

    @Override
    public void hupen() {
        System.out.println("Sportwagen hupt");
    }

    @Override
    public void waschen() {
        System.out.println("Sportwagen wäscht");
    }
}
