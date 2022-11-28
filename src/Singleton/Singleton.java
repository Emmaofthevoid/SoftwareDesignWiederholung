package Singleton;

public class Singleton {

    private static Singleton singleton;

    private Singleton() {

    }

    public static Singleton getInstance() {
        if (singleton == null) {
            System.out.println("Singleton was created");
            singleton = new Singleton();
        } else {
            System.out.println("There is a Singleton already");
        }
        return singleton;
    }

}
