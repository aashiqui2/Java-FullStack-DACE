package tamilnadu.chennai;

public class BranchOffice extends Office{

    public BranchOffice(){
        //super();
        System.out.println("In branch office class");
    }

    public static void main(String[] args) {
//        Office office = new Office();
//        office.work();
//        office.recruit();
//        office.wfh();
//        System.out.println(office.salary);

        BranchOffice office = new BranchOffice();
        office.work();//public
        office.wfh();// no modifier
        office.recruit(); // protected
    }

    protected void celebrate_local_function() {
        System.out.println("celebrate local function");
    }

}
