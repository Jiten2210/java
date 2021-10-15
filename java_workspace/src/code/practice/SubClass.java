package code.practice;

import java.util.HashMap;
import java.util.Map;

class ParentClass {

    private static Map<Class<? extends ParentClass>, ParentClass> instances = new HashMap<>();
    
    public ParentClass() {
        synchronized (ParentClass.class) {
            if (instances.containsKey(this.getClass())) {
                throw new IllegalStateException();
            }
            System.out.println(getClass());
            instances.put(getClass(), this);
        }
    }
}

public class SubClass extends ParentClass {

    public static void main(String[] args) {
        new ParentClass(); // works fine.
        // new ParentClass(); // causes an exception
        // new SubClass(); // works fine as this is the first instance of B
        new SubClass(); // causes an exception.
    }
}