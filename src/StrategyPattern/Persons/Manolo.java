package StrategyPattern.Persons;

public class Manolo extends Person{
    public Manolo(String name) {
        super(name, new LessHunger(), new ABitOfParty());
    }
}
