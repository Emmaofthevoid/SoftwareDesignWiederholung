package DecoratorPattern;

public abstract class ZutatDekorator extends Getraenke {

    protected Getraenke getraenke;

    public ZutatDekorator(Getraenke getraenke) {
        this.getraenke = getraenke;
    }

    public abstract String getBeschreibung();
}
