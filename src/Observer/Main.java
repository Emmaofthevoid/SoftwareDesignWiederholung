package Observer;

public class Main {
    public static void main(String[] args) {
        Zeitung zeitung = new Zeitung();
        Abonnent a1 = new Abonnent(zeitung, "Manolo");
        Abonnent a2 = new Abonnent(zeitung, "Carmencita");
        Article article = new Article("Liz sits next to me", " we are drinking coffee");

        zeitung.addSubscriber(a1);
        zeitung.addSubscriber(a2);

        zeitung.publishArticle(article);





    }
}
