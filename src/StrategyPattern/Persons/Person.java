package StrategyPattern.Persons;

public class Person {

    private String name;
    private Hunger hunger;
    private PartyVibe partyVibe;

    public Person(String name, Hunger hunger, PartyVibe partyVibe) {
        this.name = name;
        this.hunger = hunger;
        this.partyVibe = partyVibe;
    }

    public void eat() {
        if (hunger != null) {
            hunger.hunger();
        } else {
            System.out.println("Hunger ist null");
        }
    }

    public void party() {
        if (partyVibe != null) {
            partyVibe.bockAufParty();
        }
        else
        {
            System.out.println("No party Vibe");
        }
    }
}
