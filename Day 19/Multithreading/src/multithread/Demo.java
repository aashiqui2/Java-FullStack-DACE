package multithread;

public class Demo {
    public static void main(String[] args) {
        Demo1 d= new Demo1();// state is new
        System.out.println(d.getState());
        d.start();//created a thread  (thread asRunnable)
        System.out.println(d.getState());
        for(int j=1;j<=5;j++)
        {
            System.out.println("the value of j"+j);
        }
        System.out.println(d.getState());
    }

}
