package DecoratorPattern;

public abstract class Getraenke {

    public String name;

    public Getraenke() {
        this.name = "Some random drink";
    }

    public abstract double kostet();
    public abstract String getBeschreibung();
}
