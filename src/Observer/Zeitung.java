package Observer;

import java.util.ArrayList;

public class Zeitung {

    private ArrayList<Abonnent> abonnentArrayList;

    public Zeitung() {
        this.abonnentArrayList = new ArrayList<>();
    }

    public void addSubscriber(Abonnent a) {
        abonnentArrayList.add(a);
        System.out.println("Subscriber " + a.getName() + " was added.");
    }

    public void publishArticle(Article a ) {
        for (Abonnent ab :
                abonnentArrayList) {
        ab.getArticle(a);
        }
    }



}
