package roughwork2;

public interface CollegeRules {

    int fine_amount = 500;

    void wear_Id();

    void wear_formals();

    void hair_cutting();

    void do_not_take_leave();

    static void displayCollegeName()
    {
        System.out.println("DACE");
    }

    default void admission()
    {
        System.out.println("Admission");
    }
}
