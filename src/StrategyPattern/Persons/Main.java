package StrategyPattern.Persons;

public class Main {
    public static void main(String[] args) {

        Person manolo = new Manolo("Manolo");
        Person antonija = new Antonia("Antonja");

        manolo.eat();
        antonija.party();
    }
}
