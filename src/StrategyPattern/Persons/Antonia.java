package StrategyPattern.Persons;

public class Antonia extends Person {
    public Antonia(String name) {
        super(name, new UltraHunger(), new UltraParty());


    }
}
