package StrategyPattern.Enten;

public class Ente {

    private String name;
    private Flugverhalten flugverhalten;

    public Ente(String name, Flugverhalten flugverhalten) {
        this.name = name;
        this.flugverhalten = flugverhalten;
    }

    public void performFliegen() {
        if (flugverhalten != null) {
            flugverhalten.fliegen();
        } else {
            System.out.println("Flugverhalten ist null");
        }
    }
}
