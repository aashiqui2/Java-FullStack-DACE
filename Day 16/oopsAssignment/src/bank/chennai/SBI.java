package bank.chennai;

public class SBI {

    public SBI()
    {
        System.out.println("SBI");
    }
    SBI(String empId,String empName){
        this.empId=empId;
        this.empName=empName;
    }

    public String empName, empId;
    public static String branch_name = "chennai";

    void get_loan(int amount){

    }
    void create_account(){

    }
}
