package bank.chennai;

public class Account_Holder {
    public static void main(String[] args) {
        //SBI raja = new SBI();
        //raja.empName="raja";
        //raja.empId="21c04";
        SBI raja = new SBI("21c04","raja");
        System.out.println(raja.empId);
        System.out.println(raja.empName);
        System.out.println(SBI.branch_name);

    }
}
