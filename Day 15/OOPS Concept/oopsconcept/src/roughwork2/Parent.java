package roughwork2;

public abstract class Parent  {

    Parent(){
        System.out.println("Parent");
    }

   abstract void work();

    void cooking()
    {
        System.out.println("cooking biriyani");
    }

    public static void main(String[] args) {
        //Parent radha=new Parent();// we cannot create object
        //radha.cooking();
        //radha.work();
    }
}
