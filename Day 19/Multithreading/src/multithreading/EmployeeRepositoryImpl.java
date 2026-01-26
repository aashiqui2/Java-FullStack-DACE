package multithreading;

import java.util.*;

public class EmployeeRepositoryImpl implements EmployeeRepository {

    public static List<Employee> employeeList = new ArrayList<>();

    static {
        employeeList.add(new Employee(1, "rahul"));
        employeeList.add(new Employee(2, "kuamr"));
        employeeList.add(new Employee(3, "rajesh"));
        employeeList.add(new Employee(4, "sarah"));
    }

    @Override
    public void display() {
        for (Employee e : employeeList) {
            try {
                System.out.println(e);
               Thread.sleep(5000);
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }

    }
}
