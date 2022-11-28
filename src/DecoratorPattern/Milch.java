package DecoratorPattern;

public class Milch extends ZutatDekorator{

    public Milch(Getraenke getraenke) {
        super(getraenke);
    }

    @Override
    public double kostet() {
        return getraenke.kostet() + .50;
    }

    @Override
    public String getBeschreibung() {

      return  getraenke.getBeschreibung() + " mit Milch";

    }
}
