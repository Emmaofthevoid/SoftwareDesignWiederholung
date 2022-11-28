package StrategyPattern.Persons;

public class LessHunger implements Hunger{
    @Override
    public void hunger() {
        System.out.println("I am a litol bit hungry");
    }
}
