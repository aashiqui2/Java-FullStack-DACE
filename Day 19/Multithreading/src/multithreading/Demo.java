package multithreading;

public class Demo {
    public static void main(String[] args) {
        EmployeeService employeeService= new
                EmployeeServiceImpl(new EmployeeRepositoryImpl());

        //employeeService.run();

    }
}
