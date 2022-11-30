package Adapter;

public class StockEnte implements  Duck{
    @Override
    public void quack() {
        System.out.println("Stockente quacks");
    }

    @Override
    public void fly() {
        System.out.println("Stockente flies");
    }
}
