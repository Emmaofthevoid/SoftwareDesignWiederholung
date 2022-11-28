package StrategyPattern.Enten;

public class StrictFlugverhalten implements Flugverhalten{
    @Override
    public void fliegen() {
        System.out.println("Strictly flies...");
    }
}
