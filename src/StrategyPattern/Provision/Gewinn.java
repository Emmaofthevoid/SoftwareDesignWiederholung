package StrategyPattern.Provision;

public class Gewinn implements Provision {
    @Override
    public void calculate(Mitarbeiter m) {
        System.out.println("Gewinn: " + m.getGewinn() * 10 / 100);
    }
}
