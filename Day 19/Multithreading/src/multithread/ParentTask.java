package multithread;

public class ParentTask {
    public static void main(String[] args) throws InterruptedException {
        System.out.println(Thread.currentThread().getName());
        ChildTask ct=new ChildTask();
        System.out.println(ct.getName());
        System.out.println(ct.getState());
        ct.start();
        //ct.run();
        System.out.println(ct.getState());
        //ct.join();
        ct.interrupt();
        for(int i=1;i<=5;i++)
        {
            System.out.println("the value from parent "+i);
        }
        System.out.println(ct.getState());
    }
}
