package streams;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        Demo demo = new Demo();
        List<Employee> employeeList = demo.generateEmployee();
        List<Employee> filterEmployee= new ArrayList<>();
        for(Employee emp:employeeList){
            if(emp.getMarks()>60){
                filterEmployee.add(emp);
            }
        }
        System.out.println(filterEmployee);
//        Comparator<Employee> employeeComparator = new Comparator<Employee>() {
//            @Override
//            public int compare(Employee o1, Employee o2) {
//                return o1.getId()-o2.getId();
//            }
//        };
        Collections.sort(filterEmployee,(o1,o2)->o1.getId()-o2.getId());
        for(Employee emp:filterEmployee){
            System.out.println(emp);
        }
    }

    List<Employee> generateEmployee() {
        List<Employee> list = new ArrayList<>();
        list.add(new Employee(1, "Jack", 60));
        list.add(new Employee(4, "Sparrow", 78));
        list.add(new Employee(3, "Mike", 90));
        list.add(new Employee(5, "Spike", 40));
        list.add(new Employee(2, "Job", 80));
        return list;
    }
}
