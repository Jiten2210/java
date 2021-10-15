package code.practice;

import java.util.HashMap;
import java.util.Objects;

class Employee {

    String name;

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

}

 class HashMapExercise {

    public static void main(String args[]) {
        Employee emp1 = new Employee("One");
        Employee emp2 = new Employee("One");

        var hm = new HashMap<Employee, String>();

        hm.put(emp1, "One");
        hm.put(emp2, "Two");

        System.out.println("Both Objects are Equal: "+emp1.equals(emp2));
        System.out.println("Employee 1 Hashcode: "+emp1.hashCode());
        System.out.println("Employee 2 Hashcode: "+emp2.hashCode());
        hm.forEach((k, v) -> System.out.println("Key is: " + k + " Value is: " + v));
        System.out.println("++++ " + hm.size());
    }

}


