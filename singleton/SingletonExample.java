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

class ThreadSafeSignleton{

    private static ThreadSafeSignleton instance ;

    private ThreadSafeSignleton(){}

    public static synchronized ThreadSafeSignleton getInstance(){
        if (instance == null){
            return new ThreadSafeSignleton();
        }
        return instance;
    }
}

class DoubleCheckedLockingSingleton {
    private static volatile DoubleCheckedLockingSingleton instance;

    private DoubleCheckedLockingSingleton() {}

    public static DoubleCheckedLockingSingleton getInstance() {
        if (instance == null) {
            synchronized (DoubleCheckedLockingSingleton.class) {
                if (instance == null) {
                    instance = new DoubleCheckedLockingSingleton();
                }
            }
        }
        return instance;
    }
}

enum EnumSingleton {
    INSTANCE;

    public static EnumSingleton doSomething() {
        // Your business logic
        System.out.println("Doing something...");
        return null;
    }
}


public class SingletonExample {
    public static void main(String Args[]){
        System.out.println("this is singleton example class");

        EnumSingleton instance = EnumSingleton.doSomething();
        System.out.println(instance);
        EnumSingleton instance1 = EnumSingleton.doSomething();
        System.out.println(instance);
    }
}
