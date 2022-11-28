package Factory.Cars;

public class LKW extends Car{
    public LKW() {
        System.out.println("New LKW");
    }

    @Override
    public void hupen() {
        System.out.println("LKV hupt");
    }

    @Override
    public void waschen() {
        System.out.println("LKW wäscht");
    }
}
