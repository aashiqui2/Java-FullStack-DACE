package roughwork2;

public class Student extends Parent implements CollegeRules,TrafficRules{

    public static void main(String[] args) {
        Student chandhu=new Student();
        chandhu.sleep();
        //chandhu.fine_amount=100;
        CollegeRules.displayCollegeName(); //classname
        chandhu.admission();

        //dynamic binding
        CollegeRules cr=new Student();
        cr.admission();
        cr.do_not_take_leave();
        //cr.wear_helmet(); error

    }
    @Override
    void work() {
        System.out.println("I am Student studying java");
    }

    void sleep(){
        System.out.println("I am Student sleeping chandu");
    }

    void chat(){
        System.out.println("I am Student chatting java");
    }

    @Override
    public void wear_Id() {

    }

    @Override
    public void wear_formals() {

    }

    @Override
    public void hair_cutting() {

    }

    @Override
    public void do_not_take_leave() {

    }

    @Override
    public void gol_left() {

    }

    @Override
    public void go_slow() {

    }

    @Override
    public void wear_helmet() {

    }
}
