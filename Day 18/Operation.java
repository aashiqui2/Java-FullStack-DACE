@FunctionalInterface
public interface Operation {

    int increment(int num);

    //void add(int a,int b);
    //void sub(int a,int b);
    //void mul(int a,int b);
    //void div(int a ,int b);

    //java 8
    default void display()
    {
        System.out.println("Basic Arithmetic Operation");
    }

    public static void main(String[] args) {
        System.out.println("Hi");
    }
    
}