package code.design_pattern.creational.singleton;

public class Singleton {

    private static Singleton single_instance = null;
    public String string ;

    private Singleton() {
        string = "Hello Singleton Design Pattern";
    }

    public static Singleton getInstance() {
        if (single_instance == null)
            single_instance = new Singleton();

        return single_instance;
    }
}
