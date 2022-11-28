package StrategyPattern.Enten;

public class GrueneEnte extends Ente{
    public GrueneEnte(String name) {
        super(name, new StrictFlugverhalten());
    }
}
