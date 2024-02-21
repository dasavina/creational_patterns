package Singleton;

public class Singleton {
    private static  Singleton instance; //private static field with one object

    public String value;
    private Singleton(String value) {
        this.value = value;
    } //private constructor, so that it won't be accessed from outside
    public static Singleton getInstance(String value) {
        if (instance == null) {         //if none created earlier,
            instance = new Singleton(value); //create new one
        }
        return instance;
    }
}
