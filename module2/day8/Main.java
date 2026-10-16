class Singleton {

    private static final Singleton instance = new Singleton();

    // Private constructor
    private Singleton() {
        System.out.println("Object created");
    }

    public static Singleton getInstance() {
        return instance;
    }
}

public class Main {
    public static void main(String[] args) {

        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();

        System.out.println(obj1 == obj2); // true

        // Singleton obj3 = new Singleton();
        // Compilation error: constructor is private
    }
}