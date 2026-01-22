package lambda;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Demo {
    public static void main(String[] args) {
        Function<Integer, Integer> f = num -> num * num;
        Integer result = f.apply(2);
        System.out.println(result);

        Predicate<String> p= str -> str.length()>=5;
        System.out.println(p.test("hello"));

        Consumer<String> c= str-> System.out.println(str);
        c.accept("Java");

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);
        //for loop
        //for()
        //iterator
        //listIterator

        list.forEach((data)->System.out.println(data));

        Supplier<Integer> supplier = () -> new Random().nextInt(5);
        System.out.println(supplier.get());

        Employee emp1= new Employee(1,"rahul");
        Employee emp2= new Employee(3,"ashok");
        Employee emp3= new Employee(2,"mahit");


        List<Employee> employees = new ArrayList<>();
        employees.add(emp1);
        employees.add(emp2);
        employees.add(emp3);
        System.out.println(employees);
        Collections.sort(employees,(o1,o2) ->o1.getName().compareTo(o2.getName()));
        System.out.println(employees);


    }

}
