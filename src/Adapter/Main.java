package Adapter;

public class Main {
    public static void main(String[] args) {
            Duck adaptedDuck = new TurkeyAdapter(new BigTurkey());

            adaptedDuck.quack();
    }
}
