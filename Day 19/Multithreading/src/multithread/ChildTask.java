package multithread;

public class ChildTask extends Thread {
    @Override
    public void run()
    {
        Thread.yield();
        for(int i=1;i<=5;i++)
        {
            try{
                System.out.println("The value of i "+i);
                Thread.sleep(2000);
            }catch(Exception e){
                System.out.println("Interupted");
            }

        }
    }
}
