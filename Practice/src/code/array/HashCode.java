package code.array;

public class HashCode{

    private int id;
    private String name;

    public HashCode(int id, String name) {
        this.name = name;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        HashCode obj1 = new HashCode(1, "India");
        HashCode obj2 = new HashCode(1, "India");
        System.out.println("Alex1 hasCode(): " + obj1.hashCode());
        System.out.println("Alex2 hasCode(): " + obj2.hashCode());
        System.out.println("Checking equality: " + obj1.equals(obj2));
    }
}

