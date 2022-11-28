package DecoratorPattern;

public class Espresso extends Getraenke{
    @Override
    public double kostet() {
        return 2.5;
    }

    @Override
    public String getBeschreibung() {
        return "I am Espresso";
    }
}
