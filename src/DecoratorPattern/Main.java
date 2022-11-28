package DecoratorPattern;

public class Main {

    public static void main(String[] args) {
        Getraenke g1 = new CafeLatte();
        g1 = new ExtraShot(g1);
        g1 = new Milch(g1);
        g1 = new ExtraShot(g1);
        g1 = new ExtraShot(g1);
        g1 = new ExtraShot(g1);

        System.out.println(g1.getBeschreibung());
    }
}
