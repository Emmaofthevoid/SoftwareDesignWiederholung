package StrategyPattern.Provision;

public class Main {
    public static void main(String[] args) {

        MitarbeiterManager mitarbeiterManager = new MitarbeiterManager(new Umsatz());

        Mitarbeiter m1 = new Mitarbeiter("a", 3000, 4000);
        Mitarbeiter m2 = new Mitarbeiter("b", 9000, 3000);

        mitarbeiterManager.addMitarbeiter(m1);
        mitarbeiterManager.addMitarbeiter(m2);

        for (Mitarbeiter m : mitarbeiterManager.mitarbeitersArr) {
            System.out.println(m.getName());
            mitarbeiterManager.calculateProvision(m);
        }

        mitarbeiterManager.changeProvision(new Gewinn());

        for (Mitarbeiter m : mitarbeiterManager.mitarbeitersArr) {
            System.out.println(m.getName());
            mitarbeiterManager.calculateProvision(m);
        }
    }
}
