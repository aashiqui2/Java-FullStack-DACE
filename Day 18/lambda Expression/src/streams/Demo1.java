package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Demo1 {
    static List<Employee> generateEmployee() {
        List<Employee> list = new ArrayList<>();
        list.add(new Employee(1, "Jack", 60));
        list.add(new Employee(4, "Sparrow", 78));
        list.add(new Employee(3, "Mike", 90));
        list.add(new Employee(5, "Spike", 40));
        list.add(new Employee(2, "Job", 80));
        return list;
    }

    public static void main(String[] args) {
        List<Employee> list = generateEmployee();
//        list.forEach((emp)->{
//            System.out.println(emp); //methods refernece
//        });
        //list.forEach(emp->System.out.println(emp));
        list.forEach(System.out::println); //methods refernece

//        list.stream().filter(new Predicate<Employee>() {
//            @Override
//            public boolean test(Employee employee) {
//                if(employee.getMarks()>60){
//                    return true;
//                }
//                return false;
//            }
//        });

//        list.stream().filter((employee)-> {
//                if(employee.getMarks()>60){
//                    return true;
//                }
//                return false;
//            });

        list.stream().filter((employee)-> employee.getMarks()>60)
                .sorted((o1,o2)->o1.getId()-o2.getId())
                .forEach(System.out::println);
    }
}
