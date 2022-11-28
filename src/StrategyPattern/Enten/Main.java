package StrategyPattern.Enten;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Ente e1 = new GrueneEnte("Manolito");
        Ente e2 = new RoteEnte("Petra");

        ArrayList<Ente> list = new ArrayList();

        list.add(e1);
        list.add(e2);

        for (Ente e : list) {
            e.performFliegen();
        }
    }
}
