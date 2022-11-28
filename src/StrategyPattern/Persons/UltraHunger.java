package StrategyPattern.Persons;

public class UltraHunger implements Hunger{
    @Override
    public void hunger() {
        System.out.println("I will eat your mother as a whole.");
    }
}
