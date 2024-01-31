package OOps_38_2.a.Singleton;

public class Singleton {
    private Singleton(){

        // runs only this class to create single object class
    }
    private static Singleton instance;

    public static Singleton getInstance(){
        // check whether 1 obj only is created or not
        if (instance == null){
            instance = new Singleton();
        }
        return instance;
    }
}
