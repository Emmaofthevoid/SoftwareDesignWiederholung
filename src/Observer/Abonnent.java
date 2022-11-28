package Observer;

public class Abonnent {

    private Zeitung zeitung;
    private String name;

    public Abonnent(Zeitung zeitung, String name) {
        this.zeitung = zeitung;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void getArticle(Article a) {
        System.out.println(name + " got the article " + a.getTitle());
    }
}
