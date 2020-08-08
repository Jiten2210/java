package code.design_pattern.creational.singleton;

/*
Singleton class is a class that can have only one object (an instance of the class) at a time.
if we try to instantiate the Singleton class again, the new variable also points to the first instance created.
*/
public class SingletonPatternMain {
    public static void main(String[] args) {
        Singleton x = Singleton.getInstance();
        Singleton y = Singleton.getInstance();
        Singleton z = Singleton.getInstance();

        x.string = (x.string).toUpperCase();

        System.out.println("String from x is " + x.string);
        System.out.println("String from y is " + y.string);
        System.out.println("String from z is " + z.string);
        System.out.println("\n");

        y.string = (y.string).toLowerCase();

        System.out.println("String from x is " + x.string);
        System.out.println("String from y is " + y.string);
        System.out.println("String from z is " + z.string);
    }
}
