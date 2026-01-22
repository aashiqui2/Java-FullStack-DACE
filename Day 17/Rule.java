@FunctionalInterface
public interface Rule {

    void dontSleep(String accept);
    
    default void listen()
    {
        System.out.println("Listen to the class");
    }

    static void Learn(){
        System.out.println("i Think i am learning");
    }
    
}
