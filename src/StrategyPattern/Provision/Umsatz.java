package StrategyPattern.Provision;

public class Umsatz implements Provision {
    @Override
    public void calculate(Mitarbeiter m ) {
        System.out.println("Umsatzgeld: " + m.getUmsatz() * 5 / 100);
    }
}
