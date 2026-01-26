package multithread;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        Runnable run = new Hi();
        Thread t1= new Thread(run);
        System.out.println(t1.getState());
        System.out.println(t1.isAlive());
        t1.start();
        System.out.println(t1.getState());
        //t1.join();
        t1.interrupt();
        System.out.println("Hello");
        System.out.println(t1.getState());
        System.out.println(t1.isAlive());
    }
}

class Hi implements Runnable{

    @Override
    public void run() {
        for(int j=1;j<=5;j++){
            System.out.println("hi");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println("Dont interrupt my sleep");
            }
        }
    }
}