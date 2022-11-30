package Adapter;

public class BigTurkey implements Turkey{
    @Override
    public void gobble() {
        System.out.println("Turkey gobbles");
    }

    @Override
    public void fly() {
        System.out.println("Turkey flies");
    }
}
