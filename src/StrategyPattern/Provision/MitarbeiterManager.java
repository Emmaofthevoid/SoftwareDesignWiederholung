package StrategyPattern.Provision;

import java.util.ArrayList;

public class MitarbeiterManager {

    private Provision provision;

    public ArrayList<Mitarbeiter> mitarbeitersArr;

    public MitarbeiterManager(Provision provision) {
        this.provision = provision;
        this.mitarbeitersArr = new ArrayList<>();
    }

    public void addMitarbeiter(Mitarbeiter m) {
        mitarbeitersArr.add(m);
    }

    public void calculateProvision(Mitarbeiter m) {
        provision.calculate(m);
    }

    public void changeProvision(Provision p) {
        provision = p;
    }


}
