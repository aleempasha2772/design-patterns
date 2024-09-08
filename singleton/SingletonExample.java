package singleton;

class LazySingleton {

    // The single instance, initially null
    private static LazySingleton instance;

    // Private constructor to prevent instantiation
    private LazySingleton(){}

    // Public method to get the instance
    public static LazySingleton getInstance(){
        if (instance == null){
            instance = new LazySingleton();
        }
        return instance;
    }

}

class EagerSingleon{
    private static EagerSingleon instance = new EagerSingleon();

    private EagerSingleon(){}

    public static EagerSingleon getInstance(){
        return instance;
    }
}


public class SingletonExample {
    public static void main(String Args[]){
        System.out.println("this is singleton example class");

        EagerSingleon instance = EagerSingleon.getInstance();
        System.out.println(instance);
        EagerSingleon instance1 = EagerSingleon.getInstance();
        System.out.println(instance1);
    }
}
