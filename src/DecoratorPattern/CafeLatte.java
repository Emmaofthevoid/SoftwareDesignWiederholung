package DecoratorPattern;

public class CafeLatte extends Getraenke {

    @Override
    public double kostet() {
        return 3.4;
    }

    @Override
    public String getBeschreibung() {
        return "I am Latte";
    }
}
