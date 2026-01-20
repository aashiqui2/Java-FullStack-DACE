package tamilnadu.chennai;

public class Office {

    public final int salary = 250000;

    public Office()
    {
        System.out.println("In office class");
    }

    public static void main(String[] args) {
        Office office = new Office();
        office.work();
        office.wfh();
        System.out.println(office.salary);
        //office.salary=10000; // cannot be overridden
    }

    public void work() {
        System.out.println("working in office");
    }

    void wfh() {
        System.out.println("working in home");
    }

    protected void recruit() {
        System.out.println("recruiting");
    }

    private void do_planning() {
        System.out.println("doing planning");
    }
}
