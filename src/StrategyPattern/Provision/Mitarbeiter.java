package StrategyPattern.Provision;

public class Mitarbeiter {

    private String name;
    private double umsatz;
    private double gewinn;

    public Mitarbeiter(String name, double umsatz, double gewinn) {
        this.name = name;
        this.umsatz = umsatz;
        this.gewinn = gewinn;
    }

    public String getName() {
        return name;
    }

    public double getUmsatz() {
        return umsatz;
    }

    public double getGewinn() {
        return gewinn;
    }
}
