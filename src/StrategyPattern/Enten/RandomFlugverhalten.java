package StrategyPattern.Enten;

public class RandomFlugverhalten implements Flugverhalten{
    @Override
    public void fliegen() {
        System.out.println("**flies randomly**");
    }
}
