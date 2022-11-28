package StrategyPattern.Enten;

public class RoteEnte extends Ente{
    public RoteEnte(String name) {
        super(name, new RandomFlugverhalten());
    }
}
