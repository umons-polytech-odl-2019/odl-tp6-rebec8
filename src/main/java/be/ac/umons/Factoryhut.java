package be.ac.umons;

public class Factoryhut extends AbstractFactory {
    private static Factoryhut instance = null;
    private static int stock[];

    public Factoryhut(){ super("Factoryhut");}
    public static Factoryhut getfactory() {
        if (instance == null) {
            instance = new Factoryhut();
        }
        return instance;
    }

    @Override
    public Pizza createpizza(String name) {
        return null;
    }
}
