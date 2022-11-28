package DecoratorPattern;

public class ExtraShot extends ZutatDekorator {

    public ExtraShot(Getraenke getraenke) {
        super(getraenke);
    }

    @Override
    public double kostet() {
        return getraenke.kostet() + .70;
    }

    @Override
    public String getBeschreibung() {
        return getraenke.getBeschreibung() + " with extra shot";
    }
}
